package dao.daoInterface;

import java.util.List;
import java.util.Optional;
import entities.Author;

public interface AuthorDaoInterface {

	void addAuthor(Author author);

	Author fetchAuthorById(Long author_id);

	void updateAuthorById();

	void deleteAuthorById(Long author_id);

	Optional<Author> getAuthorById(Long author_id);

	List<Author> getAllAuthors();

}
