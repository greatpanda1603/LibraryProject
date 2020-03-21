import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.*;
import entities.*;
import service.serviceInterfaceImplementation.UserService;
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
		
		User user2 = new User();
		user2.setUserName("PPP");
		user2.setUserAge(20);
		user2.setRegistrationDate(LocalDate.parse("2020-01-01"));
		
		User user3 = new User();
		user3.setUserName("RRR");
		user3.setUserAge(35);
		user3.setRegistrationDate(LocalDate.parse("2019-12-01"));

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
		session.save(user2);
		session.save(user3);

		session.getTransaction().commit();
		
		UserService userService = new UserService();
		System.out.println(userService.getAverageUsersAge());

	}
}

//Бібліотека
//1. Подивитись, чи певна книжка доступна
//2. Вивести всі книжки по автору (основний автор, співавтор)
//3. Переглянути статистику по читачу (які книжки брав, які на руках, скільки часу користується послугами бібліотеки)
//4. Скільки книжок в бібліотеці, які видані в період незалежності
//5. Скільки разів брали певну книжку (в загальному, по примірникам, середній час читання)
//6. Отримати найпопулярніші та найнепопулярніші книжки за період
//7. Отримати список читачів-боржників з детальною інформацією
//8. Статистика по читачам (середній вік, час користування бібліотекою, середня кількість звернень за певний період)
//9. Отримати середній вік читачів по певній книжці, по певному автору
//10.Вивести по назві книжки, кількість екземплярів з інформацією про них (наявна, на руках)
