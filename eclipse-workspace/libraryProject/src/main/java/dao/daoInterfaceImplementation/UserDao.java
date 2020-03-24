package dao.daoInterfaceImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;
import dao.daoInterface.UserDaoInterfcae;
import entities.Book;
import entities.User;
import util.HibernateUtil;

public class UserDao implements UserDaoInterfcae {

	@Override
	public void add(User user) {

	}

	@Override
	public User fetchById(Long user_id) {

		return null;

	}

	@Override
	public void updateById(Long user_id, LocalDate terminationDate) {

	}

	@Override
	public void deleteById(Long user_id) {

	}

	@Override
	public Optional<User> getById(Long user_id) {

		return null;
	}

	@Override
	public Double getAverageUsersAge() {
		Session session = null;
		Double avAge = 0.0d;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select avg(u.userAge) from User u");
			avAge = (Double) query.uniqueResult();
		} catch (Exception e) {
			System.out.println("error while reading the list");

		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return avAge;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
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
	public Double getAverageAgeOfUsersByAuthor(String firstName, String lastName) {
		Session session = null;
		Double avAge = 0.0d;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery(
					"select avg(u.userAge) from User u inner join u.usages us inner join us.bookExample e inner join e.book b "
							+ "inner join b.author a where a.firstName = :firstName and a.lastName = :lastName");
			query.setString("firstName", firstName);
			query.setString("lastName", lastName);
			avAge = (Double) query.uniqueResult();
		} catch (Exception e) {
			System.out.println("error while reading the list");

		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return avAge;
	}

	@Override
	public Double getAverageAgeOfUsersByBook(String bookName) {
		Session session = null;
		Double avAge = 0.0d;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery(
					"select avg(u.userAge) from User u inner join u.usages us inner join us.bookExample e inner join e.book b where b.name = :name");
			query.setString("name", bookName);
			avAge = (Double) query.uniqueResult();
		} catch (Exception e) {
			System.out.println("error while reading the list");

		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return avAge;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getUserReadingHistory(String userName) {
		Session session = null;
		List<Book> books = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery(
					"select b from Book b inner join b.bookExamples e inner join e.userActions us inner join us.user u where u.userName = :userName");
			query.setString("userName", userName);
			books = query.list();
		} catch (Exception e) {
			System.out.println("error while reading the list");
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return books;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getBooksUserIsCurrentlyReading(String userName) {
		Session session = null;
		List<Book> books = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery(
					"select b from Book b inner join b.bookExamples e inner join e.userActions us inner join us.user u where (u.userName = :userName) and (us.returnDate is null)");
			query.setString("userName", userName);
			books = query.list();
		} catch (Exception e) {
			System.out.println("error while reading the list");
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return books;
	}

	@Override
	public LocalDate getUserRegistrationDateByName(String userName) {
		Session session = null;
		LocalDate regisatrtionDate = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select u.registrationDate from User u where u.userName = :userName");
			query.setString("userName", userName);
			regisatrtionDate = (LocalDate) query.uniqueResult();
		} catch (Exception e) {
			System.out.println("error while reading the list");
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return regisatrtionDate;
	}

	@Override
	public List<User> getDebtors() {

		return null;
	}

	@Override
	public Integer getAverageNumOfOrdersUsersMadeDuringThePeriod(List<User> users, LocalDate fromDate,
			LocalDate untilDate) {

		return null;
	}
}
