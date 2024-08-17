package Medium;

import java.util.Arrays;

public class MinimumCostForTickets {

    public int mincostTickets(int[] days, int[] costs) {

        int length = days.length;
        int maxDay = days[length-1]; // days안에 가장 큰 일
        int[] dp = new int[maxDay+1];

        dp[0] = 0;

        // 1일 부타 ~ maxDay까지탐색
        for (int i = 1; i <= maxDay; i++) {
            boolean check = false;
            // 현재 날짜가 days 안에 포함 되어 있는지 파악
            for (int j = 0; j < length; j++) {
                if(days[j] == i){
                    check = true;
                    break;
                }
            }

            //days안에 있을경우 1일, 7일, 30일 각각 계산
            if(check){
                dp[i] = Math.min(dp[i-1] + costs[0], dp[Math.max(0, i - 7)] + costs[1]);
                dp[i] = Math.min(dp[i], dp[Math.max(0, i - 30)] + costs[2]);
            }else{
                // 없을경우 전날 추가함
                dp[i] = dp[i -1];
            }
        }

        return dp[maxDay];
    }

    public static void main(String[] args) {
        MinimumCostForTickets solution = new MinimumCostForTickets();
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};
        System.out.println(solution.mincostTickets(days, costs));
        days = new int[] {1,2,3,4,5,6,7,8,9,10,30,31};
        costs = new int[] {2,7,15};
        System.out.println(solution.mincostTickets(days, costs));

    }
}
