package Easy;

import java.util.LinkedList;
import java.util.List;

/*
 * method: Sum of All Subset XOR Totals
 * description: https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
 */
public class SumOfAllSubsetXORTotals {

    int sum;
    int size;
    int[] nums;

    public int subsetXORSum(int[] nums) {

        this.sum = 0;
        this.size = nums.length;
        this.nums = nums;

        subset(0, new LinkedList<>());

        return this.sum;
    }

    public void subset(int idx, List<Integer> arr){
        this.sum += arr.stream().reduce(0,(a,b)->a^b);
        if(idx >= this.size){
            return;
        }

        for (int i = idx; i < this.size; i++) {
            arr.add(this.nums[i]);
            subset(i+1, arr);
            arr.remove(arr.size()-1);
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
