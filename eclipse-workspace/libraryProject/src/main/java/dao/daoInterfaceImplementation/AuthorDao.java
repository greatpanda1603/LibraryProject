package dao.daoInterfaceImplementation;

import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;
import dao.daoInterface.AuthorDaoInterface;
import entities.Author;
import util.HibernateUtil;

public class AuthorDao implements AuthorDaoInterface {

	@Override
	public void add(Author author) {

	}

	@Override
	public Author fetchById(Long author_id) {

		return null;
	}

	@Override
	public void updateById() {

	}

	@Override
	public void deleteById(Long author_id) {

	}

	@Override
	public Optional<Author> getById(Long author_id) {

		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Long> getIdByName(String firstName, String lastName) {
		Session session = null;
		List<Long> authorIds = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select author_id from Author where firstName = :firstName and lastName = :lastName");
			query.setString("firstName", firstName);
			query.setString("lastName", lastName);
			authorIds = query.list();
		} catch (Exception e) {
			System.out.println("error while reading the list");

		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return authorIds;
	}
		

	

	@Override
	public List<Author> getAll() {

		return null;
	}

}
