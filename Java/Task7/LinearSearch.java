package Learning;

public class LinearSearch {
	 public static int performLinearSearch(int[] arr, int element) {
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == element) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 5, 8, 10, 13, 17, 21};
	        int element = 17;
	        int index = performLinearSearch(arr, element);
	        if (index != -1) {
	            System.out.println("Target " + element + " found at index " + index);
	        } else {
	            System.out.println("Target " + element + " not found in the array");
	        }
	    }
	}

/*output
 * Target 17 found at index 5
 */
 
