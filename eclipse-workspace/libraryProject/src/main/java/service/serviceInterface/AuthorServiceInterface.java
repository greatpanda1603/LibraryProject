package service.serviceInterface;

import entities.Author;

public interface AuthorServiceInterface {

	void create(Author author);

	Author getById(Long author_id);

	void updateById();

	void deleteById(Long author_id);

}
