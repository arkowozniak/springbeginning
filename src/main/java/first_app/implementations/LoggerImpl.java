package first_app.implementations;

import java.util.Date;

import first_app.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(new Date() + ": " + message);

	}

}
