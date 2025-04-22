package Medium;

import java.util.Arrays;
/*
    - 1833. Maximum Ice Cream Bars
    - https://leetcode.com/problems/maximum-ice-cream-bars/description/
 */
public class MaximumIceCreamBars_Greedy {

    public int maxIceCream(int[] costs, int coins) {
        int count = 0;  // 구매할 수 있는 아이스크림 바의 개수

        // 아이스크림 바 가격을 오름차순으로 정렬
        Arrays.sort(costs);

        // 정렬된 가격 배열을 순회하며 구매 가능한 아이스크림 확인
        for(int cost : costs) {
            // 현재 아이스크림 가격이 남은 코인보다 크면 더 이상 구매 불가능
            if(cost > coins) {
                break;
            }
            // 아이스크림을 구매하고 남은 코인에서 가격을 차감
            coins-=cost;
            // 구매한 아이스크림 개수 증가
            count++;
        }


        return count;
    }

    public static void main(String[] args) {
        MaximumIceCreamBars_Greedy obj = new MaximumIceCreamBars_Greedy();
        int[] costs = {1,3,2,4,1};
        System.out.println(obj.maxIceCream(costs, 7));
        costs = new int[] {10,6,8,7,7,8};
        System.out.println(obj.maxIceCream(costs, 5));
        costs = new int[] {1,6,3,1,2,5};
        System.out.println(obj.maxIceCream(costs, 20));
    }
}
