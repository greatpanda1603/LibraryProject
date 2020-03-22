package dao.daoInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import entities.Book;

public interface BookDaoInterface {

	int MAX_DAYS_ALLOWED_TO_READ_BOOK = 14;
	int YEAR_OF_UKRAINE_STATE_INDEPENDENCE = 1991;

	void add(Book book);

	Book fetchById(Long book_id);

	void updateById();

	void deleteById(Long book_id);

	Optional<Book> getById(Long book_id);

	List<Book> getAll();

	List<Book> getBookByAuthorId(List<Long> authorIds);

	List<Book> getBookByCoauthorId(List<Long> authorIds);

	Optional<Book> getBooksByNameIfInStorage(String name);

	List<Book> getAllBooksPublishedAfterUkraineProclaimedIndependence();

	Integer getNumOfTimesTheBookWasRead(Long book_id);

	Integer getAvarageNumDaysTheBookWasRead(Long book_id);

	Book getTheMostPopularBookDuringThePeriod(LocalDate fromDate, LocalDate untilDate);

	Book getTheMostUnpopularBookDuringThePeriod(LocalDate fromDate, LocalDate untilDate);

}
