package service.serviceInterface;

import java.util.List;

import entities.Book;

public interface BookServiceInterface {

	void create(Book book);

	Book getById(Long book_id);

	void updateById();

	void deleteById(Long book_id);
	
	List<Book> getBookByAuthorId(List<Long> authorIds);
	
	List<Book> getBookByCoauthorId(List<Long> authorIds);
	
	List<Book> getAllBooksPublishedAfterUkraineProclaimedIndependence();

}
