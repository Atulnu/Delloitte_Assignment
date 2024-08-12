package Assignment;
import java.lang.reflect.Method;
import java.util.Scanner;

public class dynamicMethodInvoked {
	

	

	    public static void main(String[] args) {
	        try {
	            // Create an instance of the Calculator class
	            Calculator calculator = new Calculator();

	            // Take user input for the method name and parameters
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("Enter method name (add or subtract): ");
	            String methodName = scanner.nextLine();

	            System.out.print("Enter first integer: ");
	            int firstParam = scanner.nextInt();

	            System.out.print("Enter second integer: ");
	            int secondParam = scanner.nextInt();

	            // Get the method from the class
	            Method method = Calculator.class.getMethod(methodName, int.class, int.class);

	            // Invoke the method on the object instance
	            Object result = method.invoke(calculator, firstParam, secondParam);

	            // Display the result
	            System.out.println("Result: " + result);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	// Sample class with methods for dynamic invocation

	class Calculator {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }
	}


