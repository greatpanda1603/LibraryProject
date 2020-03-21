package service.serviceInterfaceImplementation;

import java.time.LocalDate;
import java.util.List;

import dao.daoInterfaceImplementation.UserDao;
import entities.User;
import service.serviceInterface.UserServiceInterface;

public class UserService implements UserServiceInterface {

	@Override
	public void createUser(User user) {
		new UserDao().addUser(user);
	}

	@Override
	public User getUserById(Long user_id) {
		return new UserDao().fetchUserById(user_id);
	}

	@Override
	public void updateUserById(Long user_id, LocalDate terminationDate) {
		new UserDao().updateUserById(user_id, terminationDate);

	}

	@Override
	public void deleteUserById(Long user_id) {
		new UserDao().deleteUserById(user_id);

	}

	@Override
	public Double getAverageUsersAge() {
		List<User> users = new UserDao().getAllUsers();
		Double sumOfAges = 0.0d;
		Double averageUsersAge;
		for (User user : users) {
			sumOfAges += user.getUserAge();
		}
		averageUsersAge = sumOfAges / users.size();
		return averageUsersAge;
	}
}
