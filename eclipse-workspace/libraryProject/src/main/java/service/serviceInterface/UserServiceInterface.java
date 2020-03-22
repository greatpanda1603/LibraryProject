package service.serviceInterface;

import java.time.LocalDate;
import entities.User;

public interface UserServiceInterface {

	void create(User user);

	User getById(Long user_id);

	void updateById(Long user_id, LocalDate terminationDate);

	void deleteById(Long user_id);

	Double getAverageUsersAge();
	
	Double getAverageNumOfUserActivities();

}
