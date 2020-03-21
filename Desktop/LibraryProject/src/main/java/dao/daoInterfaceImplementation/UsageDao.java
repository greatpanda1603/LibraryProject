package dao.daoInterfaceImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import dao.daoInterface.UsageDaoInterface;
import entities.Usage;

public class UsageDao implements UsageDaoInterface {

	@Override
	public void addUsageRecord(Usage usage) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usage fetchUsageById(Long usage_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUsageRecord(Long usage_id, LocalDate returnDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUsageRecord(Long usage_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Usage> getUsageRecordById(Long usage_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usage> getAllUsageRecords() {
		// TODO Auto-generated method stub
		return null;
	}

}
