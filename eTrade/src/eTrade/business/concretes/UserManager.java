package eTrade.business.concretes;

import eTrade.business.abstracts.UserService;
import eTrade.core.abstracts.ValidationService;
import eTrade.core.abstracts.VerificationService;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {

	private VerificationService verificationService;
	private UserDao userDao;
	private ValidationService validationService;

	public UserManager(VerificationService verificationService, UserDao userDao, ValidationService validationService) {
		super();
		this.verificationService = verificationService;
		this.userDao = userDao;
		this.validationService = validationService;
	}

	@Override
	public void signUp(User user) {
		if (!verificationService.isValid(user)) {
			System.out.println("Kullan�c� bilgileri ge�ersiz.");
		} else {
			userDao.addUser(user);
			validationService.sendMail();
			System.out.println("Yeni kullan�c� ba�ar�yla kaydedildi.");
		}
	}

	@Override
	public void logIn(String email, String password) {
		if (!verificationService.checkLogin(email,password)) {
			System.out.println("Giri� yap�ld�");
		} else {
			System.out.println("Kullan�c� bilgileri ge�ersiz.");
		}

	}

}
