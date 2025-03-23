from typing import List

class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        size = len(nums)
        left_nums = [0 for _ in range(size)]
        right_nums = [0 for _ in range(size)]

        # 왼쪽
        for i in range(1, size):
            left_nums[i] = nums[i - 1] + left_nums[i - 1]

        # 오른쪽
        for i in range(size - 2, -1, -1):
            right_nums[i] = nums[i + 1] + right_nums[i + 1]

        # 각 항목 최대값 추가
        result = [0 for _ in range(size)]
        for i in range(size):
            result[i] = abs(left_nums[i] - right_nums[i])

        return result


solution = Solution()
nums = [10,4,8,3]
print(solution.leftRightDifference(nums))

nums = [1]
print(solution.leftRightDifference(nums))