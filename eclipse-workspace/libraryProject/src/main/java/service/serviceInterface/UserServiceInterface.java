package service.serviceInterface;

import java.time.LocalDate;
import java.util.List;

import entities.Book;
import entities.User;

public interface UserServiceInterface {

	void create(User user);

	User getById(Long user_id);

	void updateById(Long user_id, LocalDate terminationDate);

	void deleteById(Long user_id);

	Double getAverageUsersAge();
	
	Double getAverageAgeOfUsersByAuthor(String firstName, String lastName);
	
	Double getAverageAgeOfUsersByBook(String bookName);
	
	Double getAverageNumOfUserActivities();
	
	List<Book> getUserReadingHistory(String userName);
	
	List<Book> getBooksUserIsCurrentlyReading(String userName);
	
	Integer getNumOfDaysUserIsUsingLibrary(String userName);

}
