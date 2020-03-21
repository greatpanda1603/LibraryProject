package service.serviceInterface;

import entities.Usage;

public interface UsageServiceInterface {
	
	void createUsage(Usage usage);

	Usage getUsageById(Long usage_id);

	void updateUsageById();

	void deleteUsageById(Long usage_id);

}
