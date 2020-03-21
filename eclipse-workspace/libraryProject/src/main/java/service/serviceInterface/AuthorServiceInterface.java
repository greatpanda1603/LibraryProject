package service.serviceInterface;

import entities.Author;

public interface AuthorServiceInterface {
	
	void createAuthor(Author author);

	Author getAuthorById(Long author_id);

	void updateAuthorById();

	void deleteAuthorById(Long author_id);

}
