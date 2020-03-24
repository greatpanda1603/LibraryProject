package dao.daoInterfaceImplementation;

import java.util.List;
import java.util.Optional;
import dao.daoInterface.AuthorDaoInterface;
import entities.Author;

public class AuthorDao implements AuthorDaoInterface {

	@Override
	public void add(Author author) {

	}

	@Override
	public Author fetchById(Long author_id) {

		return null;
	}

	@Override
	public void updateById() {

	}

	@Override
	public void deleteById(Long author_id) {

	}

	@Override
	public Optional<Author> getById(Long author_id) {

		return null;
	}

	@Override
	public List<Author> getAll() {

		return null;
	}

}
