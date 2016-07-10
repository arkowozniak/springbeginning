package first_app;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
