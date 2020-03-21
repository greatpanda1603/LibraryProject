package service.serviceInterfaceImplementation;

import dao.daoInterfaceImplementation.BookDao;
import entities.Book;
import service.serviceInterface.BookServiceInterface;

public class BookService implements BookServiceInterface {

	@Override
	public void createBook(Book book) {
		new BookDao().addBook(book);

	}

	@Override
	public Book getBookById(Long book_id) {
		return new BookDao().fetchBookById(book_id);
	}

	@Override
	public void updateBookById() {
		new BookDao().updateBookById();

	}

	@Override
	public void deleteBookById(Long book_id) {
		new BookDao().deleteBookById(book_id);

	}

}
