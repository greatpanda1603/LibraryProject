import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.*;
import entities.*;
import util.HibernateUtil;

public class SimpleTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Book book1 = new Book();
		Author author1 = new Author();

		author1.setFirstName("Taras");
		author1.setLastName("Shevechenko");

		book1.setName("Kobzar");
		book1.setAuthor(author1);

		Book book2 = new Book();
		Author author2 = new Author();

		author2.setFirstName("Lucy");
		author2.setLastName("Hawking");

		Author coauthor1 = new Author();
		Author coauthor2 = new Author();

		coauthor1.setFirstName("Stephen");
		coauthor1.setLastName("Hawking");
		coauthor2.setFirstName("Christophe");
		coauthor2.setLastName("Galfard");

		Set<Author> coauthors1 = new HashSet<Author>();

		coauthors1.add(coauthor1);
		coauthors1.add(coauthor2);

		book2.setName("George");
		book2.setAuthor(author2);
		book2.setCoauthors(coauthors1);

		User user1 = new User();
		user1.setUserName("OOO");
		user1.setUserAge(30);
		user1.setRegistrationDate(LocalDate.parse("2020-03-01"));

		BookExample bookExample1 = new BookExample();
		BookExample bookExample2 = new BookExample();
		bookExample1.setPubslishingYear(LocalDate.parse("2006-01-01"));
		bookExample2.setPubslishingYear(LocalDate.parse("2008-01-01"));

		Set<BookExample> bookExamples1 = new HashSet<BookExample>();
		bookExamples1.add(bookExample1);
		bookExamples1.add(bookExample2);

		book2.setBookExamples(bookExamples1);

		Usage usage1 = new Usage();
		usage1.setTakeDate(LocalDate.parse("2020-03-19"));
		usage1.setUser(user1);
		usage1.setBookExample(bookExample2);

		session.save(book1);
		session.save(book2);
		session.save(user1);

		session.getTransaction().commit();

	}
}
