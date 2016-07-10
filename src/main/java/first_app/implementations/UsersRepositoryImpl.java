package first_app.implementations;

import first_app.Logger;
import first_app.User;
import first_app.UsersRepository;

public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;

	public User createUser(String name) {
		logger.log("Creating new user: " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		// TODO Auto-generated method stub
		this.logger = logger;

	}
}
