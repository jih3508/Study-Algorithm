package Medium;

import java.util.Arrays;

public class FindTheOriginalArrayofPrefixXor {
  public int[] findArray(int[] pref) {
    int size = pref.length;
    int[] result = new int[size];

    result[0] = pref[0];

    int value = result[0]; // 누적한 값을 저장 할 변수
    for (int i = 1; i < size; i++) {
      result[i] = value ^ pref[i];
      value ^= result[i]; // 누적
    }

    return result;
  }

  public static void main(String[] args) {
    FindTheOriginalArrayofPrefixXor obj = new FindTheOriginalArrayofPrefixXor();
    int[] pre = {5,2,0,3,1};
    System.out.println(Arrays.toString(obj.findArray(pre)));
    pre = new int[]{13};
    System.out.println(Arrays.toString(obj.findArray(pre)));
  }

}
