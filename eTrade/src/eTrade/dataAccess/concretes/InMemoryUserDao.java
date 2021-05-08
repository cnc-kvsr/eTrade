package eTrade.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	private List<User> users = new ArrayList<User>();

	public InMemoryUserDao() {

	}

	@Override
	public void addUser(User user) {
		users.add(user);
		System.out.println("Kullanýcý kaydedildi: " + user.getEmail());

	}

	@Override
	public void deleteUser(User user) {
		User userToDelete = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);

		users.remove(userToDelete);

	}

	@Override
	public void updateUser(User user) {
		User userToUpdate = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);

		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());

	}

	@Override
	public User get(String email) {
		User user = users.stream().filter(u -> u.getEmail() == email).findFirst().orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {

		return users;
	}

}
