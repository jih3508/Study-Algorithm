package Medium;

import java.util.Arrays;

public class FindTheValueOfThePartition {

    public int findValueOfPartition(int[] nums) {

        Arrays.sort(nums); // 배열 정렬

        int minNum = Integer.MAX_VALUE;

        // 최소 차이를 구한다.
        for(int i = 0; i < nums.length - 1; i++){
            minNum = Math.min(minNum, Math.abs(nums[i + 1] - nums[i]));
        }

        return minNum;
    }

    public static void main(String[] args) {

        FindTheValueOfThePartition solution = new FindTheValueOfThePartition();

        System.out.println(solution.findValueOfPartition(new int[]{1,3,2,4}));
        System.out.println(solution.findValueOfPartition(new int[]{100,1,10}));

    }
}
