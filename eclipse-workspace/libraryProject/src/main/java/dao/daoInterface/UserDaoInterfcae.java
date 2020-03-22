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

	List<Book> getUserReadingHistory(Long user_id);

	List<Book> getBooksUserIsCurrentlyReading(Long user_id);

	Integer getNumOfDaysUserIsUsingLibrary(Long user_id);

	List<User> getDebtors();

	Integer getAverageNumOfDaysUsersAreUsingLibrary(List<User> users);

	Integer getAverageNumOfOrdersUsersMadeDuringThePeriod(List<User> users, LocalDate fromDate, LocalDate untilDate);

	Integer getAverageUsersAgeByBook(Long book_id);

	Integer getAverageUsersAgeByAuthor(Long author_id);

}
