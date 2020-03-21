package dao.daoInterfaceImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import dao.daoInterface.BookDaoInterface;
import entities.Book;

public class BookDao implements BookDaoInterface {

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book fetchBookById(Long book_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBookById() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBookById(Long book_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Book> getBookById(Long book_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> getBooksByNameIfInStorage(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooksPublishedAfterUkraineProclaimedIndependence() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumOfTimesTheBookWasRead(Long book_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getAvarageNumDaysTheBookWasRead(Long book_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getTheMostPopularBookDuringThePeriod(LocalDate fromDate, LocalDate untilDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getTheMostUnpopularBookDuringThePeriod(LocalDate fromDate, LocalDate untilDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
