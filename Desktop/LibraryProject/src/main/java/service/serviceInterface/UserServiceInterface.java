package service.serviceInterface;

import java.time.LocalDate;
import entities.User;

public interface UserServiceInterface {

	void createUser(User user);

	User getUserById(Long user_id);

	void updateUserById(Long user_id, LocalDate terminationDate);

	void deleteUserById(Long user_id);

	Double getAverageUsersAge();

}
