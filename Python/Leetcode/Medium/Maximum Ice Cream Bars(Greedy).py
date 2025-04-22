from typing import  List
"""
- 1833. Maximum Ice Cream Bars
- https://leetcode.com/problems/maximum-ice-cream-bars/description/
"""

class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        count = 0 # 구매할 수 있는 아이스크림 바의 개수
        # 아이스크림 바 가격을 오름차순으로 정렬
        costs.sort()

        # 정렬된 가격 배열을 순회하며 구매 가능한 아이스크림 확인
        for cost in costs:
            # 현재 아이스크림 가격이 남은 코인보다 크면 더 이상 구매 불가능
            if cost > coins:
                break
            # 이스크림을 구매하고 남은 코인에서 가격을 차감
            coins -= cost
            # 매한 아이스크림 개수 증가
            count += 1

        return count



solution = Solution()
costs = [1,3,2,4,1]
print(solution.maxIceCream(costs, 7))
costs = [10,6,8,7,7,8]
print(solution.maxIceCream(costs, 5))
costs = [1,6,3,1,2,5]
print(solution.maxIceCream(costs, 20))