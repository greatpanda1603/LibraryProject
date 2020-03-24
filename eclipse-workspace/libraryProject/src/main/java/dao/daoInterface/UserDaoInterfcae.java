package dao.daoInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import entities.Book;
import entities.User;

public interface UserDaoInterfcae {

	void add(User user);

	User fetchById(Long user_id);

	void updateById(Long user_id, LocalDate terminationDate);

	void deleteById(Long user_id);

	Optional<User> getById(Long user_id);

	List<User> getAll();
	
	Double getAverageUsersAge();
	
	Double getAverageAgeOfUsersByAuthor(String firstName, String lastName);
	
	Double getAverageAgeOfUsersByBook(String bookName);
	
	List<Book> getUserReadingHistory(String userName);
	
	List<Book> getBooksUserIsCurrentlyReading(String userName);	

	LocalDate getUserRegistrationDateByName (String userName);

	List<User> getDebtors();	

	Integer getAverageNumOfOrdersUsersMadeDuringThePeriod(List<User> users, LocalDate fromDate, LocalDate untilDate);

}
