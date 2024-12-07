package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArrayAccordingToGivenPivot {

    public int[] pivotArray(int[] nums, int pivot) {

        int size = nums.length;

        List<Integer> before = new ArrayList<>(); // pivot 이전 담을 리스트
        List<Integer> middle = new ArrayList<>(); // pivot 값 담을 리스트
        List<Integer> after = new ArrayList<>();  // pivot 이후 담을 리스트

        // pivot 기준으로 분기 처리
        for(int num : nums){
            // pivot 값 보다 클때
            if(num > pivot){
                after.add(num);
            }
            // pivot 값 같을때
            else if (num == pivot) {
                middle.add(num);
            }
            // pivot 값 보다 작을때
            else{
                before.add(num);
            }
        }

        int[] result = new int[size]; // 결과값
        int beforeSize = before.size(); // 이전 값 크기
        int middleSize = middle.size(); // pivot 값 크기
        int afterSize = after.size(); // 이후 값 크기


        /*
         * 값 추가한 순서
         * pivot 이전값 → pivot 값 → pivot 값 이후 순서 대로 저장
         */
        for (int i = 0; i <beforeSize; i++) {
            result[i] = before.get(i);
        }

        for (int i = beforeSize; i <  beforeSize + middleSize; i++) {
            result[i] = middle.get(i - beforeSize);
        }

        for (int i = beforeSize + middleSize; i < beforeSize + middleSize + afterSize; i++) {
            result[i] = after.get(i - beforeSize - middleSize);
        }

        return result;
    }

    public static void main(String[] args) {

        PartitionArrayAccordingToGivenPivot object = new PartitionArrayAccordingToGivenPivot();
        int[] nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(object.pivotArray(nums, 10)));

        nums = new int[] {-3,4,3,2};
        System.out.println(Arrays.toString(object.pivotArray(nums, 2)));

    }
}
