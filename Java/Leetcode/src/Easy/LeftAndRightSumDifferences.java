package Easy;

import java.util.Arrays;

public class LeftAndRightSumDifferences {

    public int[] leftRightDifference(int[] nums) {

        int size = nums.length;
        int[] leftNums = new int[size];
        int[] rightNums = new int[size];

        // 왼쪽
        for (int i = 1; i < size; i++) {
            leftNums[i] = nums[i - 1] + leftNums[i - 1];
        }

        // 오른쪽
        for (int i = size - 2; i >= 0; i--) {
            rightNums[i] = nums[i + 1] + rightNums[i + 1];
        }

        // 각 항목 최대값 추가
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = Math.abs(leftNums[i] - rightNums[i]);
        }

        return  result;
    }

    public static void main(String[] args) {

        LeftAndRightSumDifferences obj = new LeftAndRightSumDifferences();
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(obj.leftRightDifference(nums)));
        nums = new int[] {1};
        System.out.println(Arrays.toString(obj.leftRightDifference(nums)));


    }
}
