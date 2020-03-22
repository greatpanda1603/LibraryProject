package dao.daoInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import entities.Usage;

public interface UsageDaoInterface {

	void add(Usage usage);

	Usage fetchById(Long usage_id);

	void update(Long usage_id, LocalDate returnDate);

	void delete(Long usage_id);

	Optional<Usage> getById(Long usage_id);

	List<Usage> getAll();

}
