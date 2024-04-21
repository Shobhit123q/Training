package Learning;

import java.util.Arrays;

public class ArraySlicer {
	public static int[] sliceArray(int[] arr, int startIndex, int endIndex) {
        return Arrays.copyOfRange(arr, startIndex, endIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 2;
        int endIndex = 5;

        int[] slicedArray = sliceArray(arr, startIndex, endIndex);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sliced Array " + startIndex + " to " + endIndex + ": " + Arrays.toString(slicedArray));
    }
}

/*output
 * Original Array: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Sliced Array 2 to 5: [3, 4, 5, 6]
 */
	


