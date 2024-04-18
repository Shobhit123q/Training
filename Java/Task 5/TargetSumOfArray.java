package Learning;

public class TargetSumOfArray {
	public static int[] findTargetSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
            
        }
       
        throw new IllegalArgumentException("No two sum solution");
	}
	
	
	public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = findTargetSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Elements: " + nums[result[0]] + ", " + nums[result[1]]);
	}
}

/*
 * Indices: 0, 1
Elements: 2, 7
*/
