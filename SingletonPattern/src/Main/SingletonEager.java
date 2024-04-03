package Main;

public class SingletonEager {
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		System.out.println("Hello you entered SingletonEager.");
		return instance;
	}
	
}
