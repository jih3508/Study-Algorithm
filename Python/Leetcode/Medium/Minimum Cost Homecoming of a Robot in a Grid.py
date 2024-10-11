from typing import List

class Solution:
    def minCost(self, startPos: List[int], homePos: List[int], rowCosts: List[int], colCosts: List[int]) -> int:
        x1, y1 = startPos
        x2, y2 = homePos
        result = 0
        result += sum(rowCosts[x1+1: x2 +1]) if x1 < x2 else sum(rowCosts[x2:x1])
        result += sum(colCosts[y1+1: y2 +1]) if y1 < y2 else sum(colCosts[y2:y1])

        return result

solution = Solution()
startPos = [1, 0]
homePos = [2, 3]
rowCosts = [5, 4, 3]
colCosts = [8, 2, 6, 7]
print(solution.minCost(startPos, homePos, rowCosts, colCosts))