package Medium;

import java.util.Arrays;

public class MaximumXORForEachQuery {

    public int[] getMaximumXor(int[] nums, int maximumBit) {

        int size = nums.length; // nums 배열의 크기
        int[] answer = new int[size]; // 결과를 저장할 배열

        int maxNumber = (1 << maximumBit) - 1; // 2^maximumBit - 1 계산 (모든 비트가 1인 값)

        int num = nums[0]; //nums[0] 값을 초기 num으로 설정

        answer[size - 1] = num ^ maxNumber; // 마지막 인덱스에 초기 계산 값 저장

        // 나머지 요소에 대해 반복적으로 XOR 계산
        for (int i = 1; i < size; i++) {
            num ^= nums[i]; // 누적 XOR 계산

            answer[size - i - 1] = num ^ maxNumber; // 역순으로 답을 저장
        }

        return answer;
    }

    public static void main(String[] args) {

        MaximumXORForEachQuery obj = new MaximumXORForEachQuery();
        int[] nums = new int[] {0,1,1,3};
        System.out.println(Arrays.toString(obj.getMaximumXor(nums, 2)));
        nums = new int[] {2,3,4,7};
        System.out.println(Arrays.toString(obj.getMaximumXor(nums, 3)));
        nums = new int[] {0,1,2,2,5,7};
        System.out.println(Arrays.toString(obj.getMaximumXor(nums, 3)));
    }
}
