package dao.daoInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import entities.Book;

public interface BookDaoInterface {

	void addBook(Book book);

	Book fetchBookById(Long book_id);

	void updateBookById();

	void deleteBookById(Long book_id);

	Optional<Book> getBookById(Long book_id);

	List<Book> getAllBooks();

	Optional<Book> getBooksByNameIfInStorage(String name);

	List<Book> getAllBooksPublishedAfterUkraineProclaimedIndependence();

	Integer getNumOfTimesTheBookWasRead(Long book_id);

	Integer getAvarageNumDaysTheBookWasRead(Long book_id);

	Book getTheMostPopularBookDuringThePeriod(LocalDate fromDate, LocalDate untilDate);

	Book getTheMostUnpopularBookDuringThePeriod(LocalDate fromDate, LocalDate untilDate);

}
