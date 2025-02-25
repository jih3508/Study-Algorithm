package Medium;

import java.util.Arrays;

public class MaximumSwap {

  public int maximumSwap(int num) {
    int maxNum = num;

    String numStr = String.valueOf(num);
    int size = numStr.length();

    int[] nums = new int[size];

    for (int i = 0; i < size; i++) {
      nums[i] = numStr.charAt(i) - '0';
    }

    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {

        // swap
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        maxNum = Math.max(maxNum, arrayToInteger(nums));

        // 다시 원위치
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

      }
    }


    return maxNum;
  }

  // 배열을 숫자로 변환
  public int arrayToInteger(int[] array){
    StringBuilder sb = new StringBuilder();
    for (int num : array) {
      sb.append(num);
    }
    return Integer.parseInt(sb.toString());
  }

  public static void main(String[] args) {
    MaximumSwap maximumSwap = new MaximumSwap();
    System.out.println(maximumSwap.maximumSwap(2736));
    System.out.println(maximumSwap.maximumSwap(9973));

  }

}
