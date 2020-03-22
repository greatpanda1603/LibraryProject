package service.serviceInterfaceImplementation;

import java.util.List;
import dao.daoInterfaceImplementation.AuthorDao;
import entities.Author;
import service.serviceInterface.AuthorServiceInterface;

public class AuthorService implements AuthorServiceInterface {

	@Override
	public void create(Author author) {

	}

	@Override
	public Author getById(Long author_id) {

		return null;
	}

	@Override
	public void updateById() {

	}

	@Override
	public void deleteById(Long author_id) {

	}

	@Override
	public List<Long> getIdByName(String firstName, String lastName) {
		List<Long> authorIds = new AuthorDao().getIdByName(firstName, lastName);
		return authorIds;
	}

}
