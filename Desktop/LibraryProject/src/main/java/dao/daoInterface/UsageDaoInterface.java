package dao.daoInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import entities.Usage;

public interface UsageDaoInterface {

	void addUsageRecord(Usage usage);

	Usage fetchUsageById(Long usage_id);

	void updateUsageRecord(Long usage_id, LocalDate returnDate);

	void deleteUsageRecord(Long usage_id);

	Optional<Usage> getUsageRecordById(Long usage_id);

	List<Usage> getAllUsageRecords();

}
