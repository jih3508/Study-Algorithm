class Solution:
    def findValueOfPartition(self, nums: list[int]) -> int:
        nums.sort() # 정렬
        return min([abs(nums[i + 1] - nums[i]) for i in range(len(nums) - 1)]) # 차이중 최솟 값을 반환 한다.

solution = Solution()
print(solution.findValueOfPartition([1,3,2,4]))
print(solution.findValueOfPartition([100,1,10]))