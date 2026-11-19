import  bisect

class Solution:
    def searchInsert(self, nums: list[int], target: int) -> int:
        return bisect.bisect_left(nums, target)


solution = Solution()
print(solution.searchInsert([1, 3, 5, 6], 5))
print(solution.searchInsert([1, 3, 5, 6], 2))
print(solution.searchInsert([1, 3, 5, 6], 7))