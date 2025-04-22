from typing import  List
"""
- 1833. Maximum Ice Cream Bars
- https://leetcode.com/problems/maximum-ice-cream-bars/description/
"""

class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:

        max_cost = max(costs)
        # 가격별 아이스크림 개수를 저장
        counts = [0 for _ in range(max_cost + 1)]
        for cost in costs:
            counts[cost] += 1



        count = 0 # 구매할 수 있는 아이스크림 바의 개수
        cost = 1
        while cost <= max_cost and cost <= coins:

            if counts[cost] != 0:
                num_ice_cream = min(counts[cost], coins // cost)
                coins -= num_ice_cream * cost
                count += num_ice_cream

            cost += 1

        return count



solution = Solution()
costs = [1,3,2,4,1]
print(solution.maxIceCream(costs, 7))
costs = [10,6,8,7,7,8]
print(solution.maxIceCream(costs, 5))
costs = [1,6,3,1,2,5]
print(solution.maxIceCream(costs, 20))