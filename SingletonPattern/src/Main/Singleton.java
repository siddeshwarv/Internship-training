package Main;

public class Singleton {
	private static Singleton instance;
	private Singleton(){
		System.out.println("Hello this is private Constructer.");
	}
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static String Hello() {
		return "THis is Hello from Singleton";
	}
}
