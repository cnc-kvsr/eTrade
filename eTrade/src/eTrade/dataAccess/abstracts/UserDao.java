package eTrade.dataAccess.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserDao {
	void addUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	User get(String email);
	List<User> getAll();
}
