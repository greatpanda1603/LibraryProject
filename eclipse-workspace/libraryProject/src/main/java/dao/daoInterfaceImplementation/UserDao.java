package dao.daoInterfaceImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.hibernate.Session;
import dao.daoInterface.UserDaoInterfcae;
import entities.Book;
import entities.User;
import util.HibernateUtil;

public class UserDao implements UserDaoInterfcae {

	@Override
	public void addUser(User user) {

	}

	@Override
	public User fetchUserById(Long user_id) {

		return null;

	}

	@Override
	public void updateUserById(Long user_id, LocalDate terminationDate) {

	}

	@Override
	public void deleteUserById(Long user_id) {

	}

	@Override
	public Optional<User> getUserById(Long user_id) {

		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		Session session = null;
		List<User> users = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			users = session.createQuery("from User").list();
		} catch (Exception e) {
			System.out.println("error while reading the list");

		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return users;
	}

	@Override
	public List<Book> getUserReadingHistory(Long user_id) {

		return null;
	}

	@Override
	public List<Book> getBooksUserIsCurrentlyReading(Long user_id) {

		return null;
	}

	@Override
	public Integer getNumOfDaysUserIsUsingLibrary(Long user_id) {

		return null;
	}

	@Override
	public List<User> getDebtors() {

		return null;
	}

	@Override
	public Integer getAverageNumOfDaysUsersAreUsingLibrary(List<User> users) {

		return null;
	}

	@Override
	public Integer getAverageNumOfOrdersUsersMadeDuringThePeriod(List<User> users, LocalDate fromDate,
			LocalDate untilDate) {

		return null;
	}

	@Override
	public Integer getAverageUsersAgeByBook(Long book_id) {

		return null;
	}

	@Override
	public Integer getAverageUsersAgeByAuthor(Long author_id) {

		return null;
	}

}
