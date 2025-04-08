package Easy;

import java.util.LinkedList;
import java.util.List;

/*
 * method: Sum of All Subset XOR Totals
 * description: https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
 */
public class SumOfAllSubsetXORTotals {

    int sum; // 최종 XOR 합을 저장할 변수
    int size; // 배열 nums의 길이
    int[] nums;

    public int subsetXORSum(int[] nums) {

        this.sum = 0;
        this.size = nums.length;
        this.nums = nums;

        // 0번째 index와 빈 배열로 시작
        subset(0, new LinkedList<>());

        return this.sum;
    }

    public void subset(int idx, List<Integer> arr){
        // 현재 배열 arr의 모든 요소를 XOR 연산 후 sum에 추가
        this.sum += arr.stream().reduce(0,(a,b)->a^b);

        // 배열의 크기가 원본 배열 크기와 같아지면 재귀 종료
        if(idx >= this.size){
            return;
        }

        // idx부터 시작하여 부분집합을 구성
        for (int i = idx; i < this.size; i++) {
            arr.add(this.nums[i]); // 현재 요소 추가
            subset(i+1, arr); // 재귀 호출하여 다음 요소 탐색
            arr.remove(arr.size()-1); // 백트래킹을 위해 마지막 요소 제거
        }
    }

    public static void main(String[] args) {
        SumOfAllSubsetXORTotals obj = new SumOfAllSubsetXORTotals();
        int[] nums =  {1,3};
        System.out.println(obj.subsetXORSum(nums));
        nums = new int[] {5,1,6};
        System.out.println(obj.subsetXORSum(nums));
        nums = new int[] {3,4,5,6,7,8};
        System.out.println(obj.subsetXORSum(nums));
    }

}
