package Inheritance;

public class Main {

	public static void main(String[] args) {
	        int[] arrayExample = {1, 2, 3, 4, 5};
	        System.out.println("Sum of elements in the array: " + sumArray(arrayExample));
	    }

	    public static int sumArray(int[] arr) {
	        return sumArrayRecursive(arr, 0);
	    }

	    private static int sumArrayRecursive(int[] arr, int index) {
	        if (index == arr.length) {
	            return 0;
	        } else {
	            return arr[index] + sumArrayRecursive(arr, index + 1);
	        }
	    

	}

}
