package service.serviceInterface;

import java.util.List;
import entities.Author;

public interface AuthorServiceInterface {
	
	void create(Author author);

	Author getById(Long author_id);

	void updateById();

	void deleteById(Long author_id);

	List<Long> getIdByName(String firstName, String lastName);

}
