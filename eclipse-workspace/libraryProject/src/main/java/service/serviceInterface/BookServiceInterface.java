package service.serviceInterface;

import entities.Book;

public interface BookServiceInterface {

	void createBook(Book book);

	Book getBookById(Long book_id);

	void updateBookById();

	void deleteBookById(Long book_id);

}
