package Assignment;

public class singletonDemo {
	

	    public static void main(String[] args) {
	        // Get the single instance of Singleton class
	        singleton singleton1 = singleton.getInstance();
	        singleton singleton2 = singleton.getInstance();

	        // Show message using the singleton instance
	        singleton1.showMessage();

	        // Check if both instances are the same
	        if (singleton1 == singleton2) {
	            System.out.println("Both instances are the same.");
	        } else {
	            System.out.println("Different instances detected.");

}
}
}



