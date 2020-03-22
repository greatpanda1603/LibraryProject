package service.serviceInterfaceImplementation;

import java.util.List;
import dao.daoInterfaceImplementation.BookDao;
import entities.Book;
import service.serviceInterface.BookServiceInterface;

public class BookService implements BookServiceInterface {

	@Override
	public void create(Book book) {
		new BookDao().add(book);

	}

	@Override
	public Book getById(Long book_id) {
		return new BookDao().fetchById(book_id);
	}

	@Override
	public void updateById() {
		new BookDao().updateById();

	}

	@Override
	public void deleteById(Long book_id) {
		new BookDao().deleteById(book_id);

	}

	@Override
	public List<Book> getBookByAuthorId(List<Long> authorIds) {
		List<Book> books = new BookDao().getBookByAuthorId(authorIds);
		return books;
	}

	@Override
	public List<Book> getBookByCoauthorId(List<Long> authorIds) {
		List<Book> books = new BookDao().getBookByCoauthorId(authorIds);
		return books;
	}

	@Override
	public List<Book> getAllBooksPublishedAfterUkraineProclaimedIndependence() {
		List<Book> books = new BookDao().getAllBooksPublishedAfterUkraineProclaimedIndependence();
		return books;
	}

}
