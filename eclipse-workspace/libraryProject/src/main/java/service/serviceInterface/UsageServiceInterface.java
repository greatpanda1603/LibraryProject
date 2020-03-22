package service.serviceInterface;

import entities.Usage;

public interface UsageServiceInterface {
	
	void create(Usage usage);

	Usage getById(Long usage_id);

	void updateById();

	void deleteById(Long usage_id);

}
