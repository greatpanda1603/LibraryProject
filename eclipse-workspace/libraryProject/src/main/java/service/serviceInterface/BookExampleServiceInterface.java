package service.serviceInterface;

import entities.BookExample;

public interface BookExampleServiceInterface {
	
	void createBookExample(BookExample bookExample);

	BookExample getBookExampleById(Long bookExample_id);

	void updateBookExampleById();

	void deleteBookExampleById(Long bookExample_id);

}
