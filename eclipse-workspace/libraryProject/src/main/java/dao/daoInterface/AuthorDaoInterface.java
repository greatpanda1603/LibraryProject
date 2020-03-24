package dao.daoInterface;

import java.util.List;
import java.util.Optional;
import entities.Author;

public interface AuthorDaoInterface {

	void add(Author author);

	Author fetchById(Long author_id);

	void updateById();

	void deleteById(Long author_id);

	Optional<Author> getById(Long author_id);
	
	List<Author> getAll();

}
