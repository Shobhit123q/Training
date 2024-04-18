package Learning;

public class Calculator {
	
	public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN;
        }
        return num1 / num2;
    }


	public static void main(String[] args) {
		 if (args.length != 3) {
	            System.out.println("Do the operation:");
	            return;
	        }
		 String operation= args[0];
		 int num1=Integer.valueOf(args[1]);
		 int num2=Integer.valueOf(args[2]);
		 System.out.println("First number"+num1);
		 System.out.println("Second number"+num2);
		 
		    int result = 0;
	        switch (operation) {
	            case "add":
	                result = add(num1, num2);
	                break;
	            case "subtract":
	                result = subtract(num1, num2);
	                break;
	            case "multiply":
	                result = multiply(num1, num2);
	                break;
	            case "divide":
	                result = (int) divide(num1, num2);
	                break;
	            default:
	                System.out.println("Invalid operation. Available operations: add, subtract, multiply, divide");
	                return;
	        }

	        System.out.println("Result: " + result);
	    }
	
		

	}

/*
 * First number10
Second number20
Result: 30
*/
