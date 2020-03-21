package dao.daoInterface;

import java.util.List;
import java.util.Optional;
import entities.BookExample;

public interface BookExampleDaoInterface {
	
	void addBookExample(BookExample bookExample);

	BookExample fetchBookExampleById(Long bookExample_id);

	void updateBookExampleById();

	void deleteBookExampleById(Long bookExample_id);

	Optional<BookExample> getBookExampleById(Long bookExample_id);

	List<BookExample> getAllBookExamples();

}
