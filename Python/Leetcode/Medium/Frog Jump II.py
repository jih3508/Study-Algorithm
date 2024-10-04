from typing import List

class Solution:
    def maxJump(self, stones: List[int]) -> int:
        size = len(stones)
        return max(stones[i] - stones[i-2] for i in range(2, size)) if size > 2 else stones[1] - stones[0]

solution = Solution()
stones = [0,2,5,6,7]
print(solution.maxJump(stones))
stones = [0,3,9]
print(solution.maxJump(stones))