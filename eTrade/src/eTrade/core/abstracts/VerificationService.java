package eTrade.core.abstracts;

import eTrade.entities.concretes.User;

public interface VerificationService {
		boolean isValid(User user);
		boolean checkLogin(String email,String password);
		
}
