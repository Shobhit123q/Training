package com.operation;

public class Main {

	public static void main(String[] args) {
		int a = 10;
        int b = 5;

       
        int sum = Addition.add(a, b);
        System.out.println("Sum: " + sum);

        
        int difference = Substraction.subtract(a, b);
        System.out.println("Difference: " + difference);

        
        int product = Multiplication.multiply(a, b);
        System.out.println("Product: " + product);
        double quotient = Division.divide(a, b);
        System.out.println("Quotient: " + quotient);
    }

	

}

/*first run this command 
 * javac -d . Addition.java Subtraction.java Multiplication.java Division.java
 * and after this we have run
 * java -cp . com.math.operations.Addition
java -cp . com.math.operations.Subtraction
java -cp . com.math.operations.Multiplication
java -cp . com.math.operations.Division to get the result.
*/