package eTrade;

import eTrade.business.abstracts.UserService;
import eTrade.business.concretes.UserManager;
import eTrade.core.concretes.EmailValidatorManager;
import eTrade.core.concretes.GoogleServiceAdapter;
import eTrade.dataAccess.concretes.InMemoryUserDao;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Kevser");
		user1.setFirstName("Canca");
		user1.setEmail("kevsercanca@gmail.com");
		user1.setPassword("12345");
		
		UserService userService = new UserManager(new GoogleServiceAdapter(),
				new InMemoryUserDao(),new EmailValidatorManager());
		userService.signUp(user1);
		userService.logIn("kevsercanca@gmail.com", "12345");
		
	}

}
