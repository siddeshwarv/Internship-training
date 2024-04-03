package Main;

public class SingletonDoubleCheck {
	//volatile keyword to ensure thread safety
	    private static volatile SingletonDoubleCheck obj = null;
	    private SingletonDoubleCheck() {}

	    public static SingletonDoubleCheck getInstance()
	    {
	    	
	        if (obj == null) {
	            // To make thread safe
	            synchronized (SingletonDoubleCheck.class)
	            {
	                // check again as multiple threads
	                // can reach above step
	                if (obj == null)
	                    obj = new SingletonDoubleCheck();
	            }
	        }
	        return obj;
	    }
	}


