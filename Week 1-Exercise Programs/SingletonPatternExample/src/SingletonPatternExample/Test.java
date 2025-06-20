package SingletonPatternExample;

public class Test {

	public static void main(String[] args) {

		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		logger1.display();
		logger2.display();
		
		System.out.println(logger1.hashCode());
		System.out.println(logger2.hashCode());
		
		if(logger1 == logger2 && logger1.hashCode() == logger2.hashCode()) System.out.println("Only one instance is  created.");
		else System.out.println("It is not of type Singleton Pattern");
	}

}
