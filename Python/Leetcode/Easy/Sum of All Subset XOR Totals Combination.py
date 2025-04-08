from typing import List
from itertools import combinations

'''
 - method: Sum of All Subset XOR Totals
 - description: https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
'''
class Solution:

    def subsetXORSum(self, nums: List[int]) -> int:
        size = len(nums) # 배열 nums의 길이

        result = 0 # 최종 XOR 합을 저장할 변수
        for i in range(1, size + 1):
            for arr in combinations(nums, i): # i 크기만큼 조합
                xor_sum = 0
                # 현재 배열 arr의 모든 요소를 XOR 연산 후 result에 추가
                for num in arr:
                    xor_sum ^= num
                result += xor_sum

        return result

solution = Solution()
nums = [1, 3]
print(solution.subsetXORSum(nums))
nums = [5,1,6]
print(solution.subsetXORSum(nums))
nums = [3,4,5,6,7,8]
print(solution.subsetXORSum(nums))