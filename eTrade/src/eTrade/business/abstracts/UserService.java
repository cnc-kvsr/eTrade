package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface UserService {
	void signUp(User user);

	void logIn(String email, String password);
}
