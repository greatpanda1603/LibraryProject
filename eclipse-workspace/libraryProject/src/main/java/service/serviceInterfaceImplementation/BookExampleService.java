package service.serviceInterfaceImplementation;

import java.util.List;

import dao.daoInterfaceImplementation.BookExampleDao;
import entities.BookExample;
import service.serviceInterface.BookExampleServiceInterface;

public class BookExampleService implements BookExampleServiceInterface {

	@Override
	public void create(BookExample bookExample) {

	}

	@Override
	public entities.BookExample getById(Long bookExample_id) {

		return null;
	}

	@Override
	public void updateById() {

	}

	@Override
	public void deleteById(Long bookExample_id) {

	}

	@Override
	public Integer getNumOfBookExamplesByBookName(String bookName) {
		return new BookExampleDao().getBookExamplesByBookName(bookName).size();
	}

	@Override
	public void getBookExamplesByBookNameWhichAreAvailable(String bookName) {
		List<BookExample> bookExamplesAvailable = new BookExampleDao()
				.getBookExamplesByBookNameWhichAreAvailable(bookName);
		System.out.println("The book " + bookName
				+ " is represented by the following book examples which are available at the moment");
		for (BookExample bookExample : bookExamplesAvailable) {
			System.out.println(bookExample);
		}
	}

	@Override
	public void getBookExamplesByBookNameWhichWereTaken(String bookName) {
		List<BookExample> bookExamplesTaken = new BookExampleDao().getBookExamplesByBookNameWhichWereTaken(bookName);
		System.out.println("The following book examples of the book " + bookName + " are NOT available");
		for (BookExample bookExample : bookExamplesTaken) {
			System.out.println(bookExample);
		}
	}
}
