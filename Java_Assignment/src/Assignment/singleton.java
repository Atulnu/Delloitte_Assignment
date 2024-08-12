package Assignment;

public class singleton{

	    // Static variable to hold the single instance of the class
	    private static singleton instance;

	    // Private constructor to prevent instantiation
	    private singleton() {}

	    // Public method to provide global access to the instance
	    public static singleton getInstance() {
	        if (instance == null) {
	            instance = new singleton();
	        }
	        return instance;
	    }

	    // Example method to demonstrate functionality
	    public void showMessage() {
	        System.out.println("Hello from Singleton!");
	    }
	}


	