package dao.daoInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import entities.Book;
import entities.User;

public interface UserDaoInterfcae {

	void addUser(User user);

	User fetchUserById(Long user_id);

	void updateUserById(Long user_id, LocalDate terminationDate);

	void deleteUserById(Long user_id);

	Optional<User> getUserById(Long user_id);

	List<User> getAllUsers();

	List<Book> getUserReadingHistory(Long user_id);

	List<Book> getBooksUserIsCurrentlyReading(Long user_id);

	Integer getNumOfDaysUserIsUsingLibrary(Long user_id);

	List<User> getDebtors();

	Integer getAverageNumOfDaysUsersAreUsingLibrary(List<User> users);

	Integer getAverageNumOfOrdersUsersMadeDuringThePeriod(List<User> users, LocalDate fromDate, LocalDate untilDate);

	Integer getAverageUsersAgeByBook(Long book_id);

	Integer getAverageUsersAgeByAuthor(Long author_id);

}
