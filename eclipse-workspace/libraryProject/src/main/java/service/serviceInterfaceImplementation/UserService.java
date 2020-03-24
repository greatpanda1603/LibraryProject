package service.serviceInterfaceImplementation;

import java.time.LocalDate;
import java.util.List;
import java.time.temporal.ChronoUnit;
import dao.daoInterfaceImplementation.UserDao;
import entities.Book;
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
		return new UserDao().getAverageUsersAge();
	}

	public Double getAverageNumOfUserActivities() {

		return null;
	}

	@Override
	public Double getAverageAgeOfUsersByAuthor(String firstName, String lastName) {
		return new UserDao().getAverageAgeOfUsersByAuthor(firstName, lastName);

	}

	@Override
	public Double getAverageAgeOfUsersByBook(String bookName) {
		return new UserDao().getAverageAgeOfUsersByBook(bookName);
	}

	@Override
	public List<Book> getUserReadingHistory(String userName) {
		return new UserDao().getUserReadingHistory(userName);
	}

	@Override
	public List<Book> getBooksUserIsCurrentlyReading(String userName) {
		return new UserDao().getBooksUserIsCurrentlyReading(userName);
	}

	@Override
	public Integer getNumOfDaysUserIsUsingLibrary(String userName) {
		Integer days = (int) ChronoUnit.DAYS.between(new UserDao().getUserRegistrationDateByName(userName),
				LocalDate.now());
		return days;
	}
}
