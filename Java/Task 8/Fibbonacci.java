package Learning;

import java.util.Arrays;

public class Fibbonacci {
	public static int[] generateFibonacciArray(int n) {
        int[] fibonacciArr = new int[n];
        
        
        if (n >= 1) {
            fibonacciArr[0] = 0;
        }
        if (n >= 2) {
            fibonacciArr[1] = 1;
        }
        
        
        for (int i = 2; i < n; i++) {
            fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
        }
        
        return fibonacciArr;
    }

    public static void main(String[] args) {
        int n = 10; 

        int[] fibonacciSequence = generateFibonacciArray(n);

        
        System.out.println("Fibonacci Sequence of " + n + " elements:");
        System.out.println(Arrays.toString(fibonacciSequence));
    }

}

/*Fibonacci Sequence of 10 elements:
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
*/
