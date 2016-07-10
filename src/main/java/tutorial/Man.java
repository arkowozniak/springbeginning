package tutorial;

import first_app.Logger;
import first_app.User;
import first_app.UsersRepository;
import first_app.implementations.LoggerImpl;
import first_app.implementations.UsersRepositoryImpl;


public class Man {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		User user = usersRepository.createUser("Arek");
		
	}

}
