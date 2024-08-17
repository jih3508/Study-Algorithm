class Solution:
    def mincostTickets(self, days: list[int], costs: list[int]) -> int:
        maxDays = days[-1] # days안에 가장 큰 일수
        dp = [0] * (maxDays + 1)
        checkDays = set(days)

        # 1일 부터 maxDays까지 탐색
        for i in range(1, maxDays+1):

            # days일수 있을 경우 1일, 7일, 30일중 가장 적은 비용적용
            if(i in checkDays):
                dp[i] = min(dp[i - 1] + costs[0], dp[max(0, i - 7)] + costs[1], dp[max(0, i - 30)] + costs[2])
            # 없을 경우 전에 비용 갔고옴
            else:
                dp[i] = dp[i - 1]

        return dp[maxDays]


solution = Solution()
days = [1,4,6,7,8,20]
costs = [2,7,15]
print(solution.mincostTickets(days, costs))
days = [1,2,3,4,5,6,7,8,9,10,30,31]
costs = [2,7,15]
print(solution.mincostTickets(days, costs))