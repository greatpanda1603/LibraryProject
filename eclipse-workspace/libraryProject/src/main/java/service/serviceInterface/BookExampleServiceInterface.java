package service.serviceInterface;

import entities.BookExample;

public interface BookExampleServiceInterface {

	void create(BookExample bookExample);

	BookExample getById(Long bookExample_id);

	void updateById();

	void deleteById(Long bookExample_id);

	Integer getNumOfBookExamplesByBookName(String bookName);

	void getBookExamplesByBookNameWhichAreAvailable(String bookName);

	void getBookExamplesByBookNameWhichWereTaken(String bookName);

}
