package dao.daoInterfaceImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import dao.daoInterface.UsageDaoInterface;
import entities.Usage;

public class UsageDao implements UsageDaoInterface {

	@Override
	public void add(Usage usage) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usage fetchById(Long usage_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long usage_id, LocalDate returnDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long usage_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Usage> getById(Long usage_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usage> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
