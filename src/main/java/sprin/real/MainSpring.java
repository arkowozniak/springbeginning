package sprin.real;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import first_app.User;
import first_app.UsersRepository;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfig.xml");

		UsersRepository usersRepository = context.getBean("userRepository", UsersRepository.class);

		User user = usersRepository.createUser("Areks");
	}

}
