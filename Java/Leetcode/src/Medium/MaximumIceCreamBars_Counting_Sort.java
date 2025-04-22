package Medium;

import java.util.Arrays;
/*
    - 1833. Maximum Ice Cream Bars
    - https://leetcode.com/problems/maximum-ice-cream-bars/description/
 */
public class MaximumIceCreamBars_Counting_Sort {

    public int maxIceCream(int[] costs, int coins) {

        int maxCost = Arrays.stream(costs).max().getAsInt(); // 가장 비싼 아이스크림 가격 찾기

        // 가격별 아이스크림 개수를 저장
        int[] counts = new int[maxCost + 1];
        for(int cost : costs) {
            counts[cost]++;
        }

        int count = 0;
        // 가장 저렴한 가격부터 순회
        for(int cost = 1; cost <= maxCost && cost <= coins; cost++) {
            if(counts[cost] != 0) {
                // 현재 가격의 아이스크림을 최대한 많이 구매
                int numIceCream = Math.min(counts[cost], coins / cost);
                coins -= numIceCream * cost;
                count += numIceCream;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MaximumIceCreamBars_Counting_Sort obj = new MaximumIceCreamBars_Counting_Sort();
        int[] costs = {1,3,2,4,1};
        System.out.println(obj.maxIceCream(costs, 7));
        costs = new int[] {10,6,8,7,7,8};
        System.out.println(obj.maxIceCream(costs, 5));
        costs = new int[] {1,6,3,1,2,5};
        System.out.println(obj.maxIceCream(costs, 20));
    }
}
