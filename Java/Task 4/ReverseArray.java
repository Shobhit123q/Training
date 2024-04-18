package Learning;

public class ReverseArray {
	public static void printReverseArray(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
        System.out.print(array[i] + " ");
    }
}

	public static void main(String[] args) {
		int[] array = {34,45,46,34,22};
		printReverseArray(array);
 
	}
        
        
	}

/*output
22 34 46 45 34 

 */



