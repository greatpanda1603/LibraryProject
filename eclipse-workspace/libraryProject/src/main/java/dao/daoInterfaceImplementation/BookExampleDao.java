package dao.daoInterfaceImplementation;

import java.util.List;
import java.util.Optional;
import org.hibernate.Query;
import org.hibernate.Session;
import dao.daoInterface.BookExampleDaoInterface;
import entities.BookExample;
import util.HibernateUtil;

public class BookExampleDao implements BookExampleDaoInterface {

	@Override
	public void add(BookExample bookExample) {

	}

	@Override
	public BookExample fetchById(Long bookExample_id) {

		return null;
	}

	@Override
	public void updateById() {

	}

	@Override
	public void deleteById(Long bookExample_id) {

	}

	@Override
	public Optional<BookExample> getById(Long bookExample_id) {

		return null;
	}

	@Override
	public List<BookExample> getAll() {

		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookExample> getBookExamplesByBookName(String bookName) {
		Session session = null;
		List<BookExample> bookExamples = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select e from BookExample e inner join e.book b where b.name = :name)");
			query.setString("name", bookName);
			bookExamples = query.list();
		} catch (Exception e) {
			System.out.println("error while reading the list");
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return bookExamples;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookExample> getBookExamplesByBookNameWhichAreAvailable(String bookName) {
		Session session = null;
		List<BookExample> bookExamples = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery(
					"select e from BookExample e inner join e.book b inner join e.userActions us where (b.name = :name) and ((us.takeDate is not null) and (us.returnDate is not null)) or (us.takeDate is null)");
			query.setString("name", bookName);
			bookExamples = query.list();
		} catch (Exception e) {
			System.out.println("error while reading the list");
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return bookExamples;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookExample> getBookExamplesByBookNameWhichWereTaken(String bookName) {
		Session session = null;
		List<BookExample> bookExamples = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery(
					"select e from BookExample e inner join e.book b inner join e.userActions us where (b.name = :name) and (us.returnDate is null)");
			query.setString("name", bookName);
			bookExamples = query.list();
		} catch (Exception e) {
			System.out.println("error while reading the list");
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return bookExamples;
	}

}
