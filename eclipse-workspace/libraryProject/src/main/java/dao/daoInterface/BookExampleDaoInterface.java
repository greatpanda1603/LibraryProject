package dao.daoInterface;

import java.util.List;
import java.util.Optional;
import entities.BookExample;

public interface BookExampleDaoInterface {
	
	void add(BookExample bookExample);

	BookExample fetchById(Long bookExample_id);

	void updateById();

	void deleteById(Long bookExample_id);

	Optional<BookExample> getById(Long bookExample_id);

	List<BookExample> getAll();

}
