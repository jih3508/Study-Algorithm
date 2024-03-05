package Easy;

import java.util.Arrays;

public class Two_Sum {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.twoSum(new int[] {2,7,11,15}, 9)));
		System.out.println(Arrays.toString(solution.twoSum(new int[] {3, 2, 4}, 6)));
		System.out.println(Arrays.toString(solution.twoSum(new int[] {3, 3}, 6)));
	}

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for(int i = 0; i < length; i++) {
        	for(int j = i + 1; j < length; j++) {
        		if(nums[i] + nums[j] == target) {
        			return new int[] {i, j};
        		}
        	}
        }
        
        return null;
    }
}
