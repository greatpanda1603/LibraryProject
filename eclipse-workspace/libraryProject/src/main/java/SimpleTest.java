import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.*;
import entities.*;
import service.serviceInterfaceImplementation.AuthorService;
import service.serviceInterfaceImplementation.BookService;
import service.serviceInterfaceImplementation.UserService;
import util.HibernateUtil;

public class SimpleTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();

		book1.setName("Kobzar");
		book2.setName("George's Secret Key to the Universe");
		book3.setName("A Brief History of Time");
		book4.setName("The Universe in a Nutshell");

		Author author1 = new Author();
		Author author2 = new Author();
		Author author3 = new Author();
		Author author4 = new Author();
		Author author5 = new Author();

		author1.setFirstName("Taras");
		author1.setLastName("Shevchenko");

		author2.setFirstName("Lucy");
		author2.setLastName("Hawking");

		author3.setFirstName("Stephen");
		author3.setLastName("Hawking");

		author4.setFirstName("Christophe");
		author4.setLastName("Galfard");

		author5.setFirstName("Leonard");
		author5.setLastName("Mlodinow");

		book1.setAuthor(author1);
		book2.setAuthor(author2);
		book3.setAuthor(author3);
		book4.setAuthor(author3);

		Set<Author> coauthors1 = new HashSet<Author>();
		Set<Author> coauthors2 = new HashSet<Author>();

		coauthors1.add(author3);
		coauthors1.add(author4);
		coauthors2.add(author5);

		book2.setCoauthors(coauthors1);
		book3.setCoauthors(coauthors2);

		BookExample bookExample1 = new BookExample();
		BookExample bookExample2 = new BookExample();
		BookExample bookExample3 = new BookExample();
		BookExample bookExample4 = new BookExample();
		BookExample bookExample5 = new BookExample();
		BookExample bookExample6 = new BookExample();
		BookExample bookExample7 = new BookExample();
		BookExample bookExample8 = new BookExample();
		BookExample bookExample9 = new BookExample();
		BookExample bookExample10 = new BookExample();

		bookExample1.setPubslishingYear(2007);
		bookExample2.setPubslishingYear(2008);
		bookExample3.setPubslishingYear(1988);
		bookExample4.setPubslishingYear(2000);
		bookExample5.setPubslishingYear(2005);
		bookExample6.setPubslishingYear(2001);
		bookExample7.setPubslishingYear(1962);
		bookExample8.setPubslishingYear(1985);
		bookExample9.setPubslishingYear(2006);
		bookExample10.setPubslishingYear(2009);

		Set<BookExample> bookExamples1 = new HashSet<BookExample>();
		bookExamples1.add(bookExample7);
		bookExamples1.add(bookExample8);
		bookExamples1.add(bookExample9);
		bookExamples1.add(bookExample10);

		Set<BookExample> bookExamples2 = new HashSet<BookExample>();
		bookExamples2.add(bookExample6);

		Set<BookExample> bookExamples3 = new HashSet<BookExample>();
		bookExamples3.add(bookExample1);
		bookExamples3.add(bookExample2);

		Set<BookExample> bookExamples4 = new HashSet<BookExample>();
		bookExamples4.add(bookExample3);
		bookExamples4.add(bookExample4);
		bookExamples4.add(bookExample5);

		book1.setBookExamples(bookExamples1);
		book2.setBookExamples(bookExamples3);
		book3.setBookExamples(bookExamples4);
		book4.setBookExamples(bookExamples2);

		User user1 = new User();
		user1.setUserName("OOO");
		user1.setUserAge(30);
		user1.setRegistrationDate(LocalDate.parse("2020-03-01"));

		User user2 = new User();
		user2.setUserName("PPP");
		user2.setUserAge(20);
		user2.setRegistrationDate(LocalDate.parse("2020-01-01"));

		User user3 = new User();
		user3.setUserName("RRR");
		user3.setUserAge(35);
		user3.setRegistrationDate(LocalDate.parse("2019-12-01"));

		User user4 = new User();
		user4.setUserName("SSS");
		user4.setUserAge(18);
		user4.setRegistrationDate(LocalDate.parse("2018-11-22"));

		User user5 = new User();
		user5.setUserName("TTT");
		user5.setUserAge(60);
		user5.setRegistrationDate(LocalDate.parse("2017-07-03"));

		Usage usage1 = new Usage();
		usage1.setTakeDate(LocalDate.parse("2020-03-19"));
		usage1.setUser(user1);
		usage1.setBookExample(bookExample2);

		Usage usage2 = new Usage();
		usage2.setTakeDate(LocalDate.parse("2020-01-15"));
		usage2.setUser(user2);
		usage2.setBookExample(bookExample5);

		Usage usage3 = new Usage();
		usage3.setTakeDate(LocalDate.parse("2019-12-19"));
		usage3.setUser(user3);
		usage3.setBookExample(bookExample4);

		session.save(book1);
		session.save(book2);
		session.save(book3);
		session.save(book4);
		session.save(user1);
		session.save(user2);
		session.save(user3);
		session.save(user4);
		session.save(user5);
		session.save(usage1);
		session.save(usage2);
		session.save(usage3);

		session.getTransaction().commit();

//		UserService userService = new UserService();
//		System.out.println(userService.getAverageUsersAge());
//
//		AuthorService authorService = new AuthorService();
//
//		BookService bookService = new BookService();
//		System.out.println(bookService.getBookByAuthorId(authorService.getIdByName("Stephen", "Hawking")));
//
//		System.out.println(bookService.getBookByCoauthorId(authorService.getIdByName("Stephen", "Hawking")));
//
//		System.out.println(bookService.getAllBooksPublishedAfterUkraineProclaimedIndependence());

	}
}
