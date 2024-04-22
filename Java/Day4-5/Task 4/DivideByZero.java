package Learning;

public class DivideByZero {

	public static void main(String[] args) {
		try {
            int a = 10;
            int b = 0;
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

	}

//output:Error: Division by zero is not allowed.
