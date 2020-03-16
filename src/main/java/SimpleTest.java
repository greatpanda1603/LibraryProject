import org.hibernate.*;

public class SimpleTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Book book = new Book();

		book.setId(100L);
		book.setName("Mukesh");

		session.save(book);
		session.getTransaction().commit();

	}

}
