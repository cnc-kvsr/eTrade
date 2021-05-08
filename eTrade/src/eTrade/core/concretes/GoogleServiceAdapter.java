package eTrade.core.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.JGoogle.GoogleService;
import eTrade.core.abstracts.VerificationService;
import eTrade.entities.concretes.User;

public class GoogleServiceAdapter implements VerificationService {

	List<User> users = new ArrayList<User>();
	
	@Override
	public boolean isValid(User user) {
		GoogleService googleService = new GoogleService();
		return googleService.isValid();
	}

	@Override
	public boolean checkLogin(String email, String password) {
		for(User user : users) {
			if(user.getEmail()==email && user.getPassword()==password)
				return true;
		}
		return false;
	}

}
