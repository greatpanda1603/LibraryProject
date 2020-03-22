package service.serviceInterfaceImplementation;

import java.time.LocalDate;
import java.util.List;

import dao.daoInterfaceImplementation.UserDao;
import entities.User;
import service.serviceInterface.UserServiceInterface;

public class UserService implements UserServiceInterface {

	@Override
	public void create(User user) {
		new UserDao().add(user);
	}

	@Override
	public User getById(Long user_id) {
		return new UserDao().fetchById(user_id);
	}

	@Override
	public void updateById(Long user_id, LocalDate terminationDate) {
		new UserDao().updateById(user_id, terminationDate);

	}

	@Override
	public void deleteById(Long user_id) {
		new UserDao().deleteById(user_id);

	}

	@Override
	public Double getAverageUsersAge() {
		List<User> users = new UserDao().getAll();
		Double sumOfAges = 0.0d;
		Double averageUsersAge;
		for (User user : users) {
			sumOfAges += user.getUserAge();
		}
		averageUsersAge = sumOfAges / users.size();
		return averageUsersAge;
	}
	
	public Double getAverageNumOfUserActivities() {
//		List<User> users = new UserDao().getAll();
//		Double sumOfAges = 0.0d;
//		Double averageUsersAge;
//		for (User user : users) {
//			sumOfAges += user.getUserAge();
//		}
//		averageUsersAge = sumOfAges / users.size();
		return null;
	}
}
