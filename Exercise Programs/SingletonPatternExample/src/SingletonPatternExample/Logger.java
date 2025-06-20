package SingletonPatternExample;

public class Logger {
	private static Logger instance;
	private Logger() {
		
	}
	public static Logger getInstance() {
		if(instance == null) instance = new Logger();
		return instance;
	}
	public void display() {
		System.out.println("I have created an instance in Singleton and ensures successful execution.");
	}
}
