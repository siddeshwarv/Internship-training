package Main;

public class SingletonSynchronized {
		private static SingletonSynchronized obj;
	    private SingletonSynchronized() {}
	    // Only one thread can execute this at a time
	    public static synchronized SingletonSynchronized getInstance()
	    {
	    	System.out.println("This is thread safe only one theard can instantitae at a time.");
	        if (obj == null)
	            obj = new SingletonSynchronized();
	        return obj;
	    }
}

