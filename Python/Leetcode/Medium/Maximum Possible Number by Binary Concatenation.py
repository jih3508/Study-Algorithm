from typing import List
from itertools import permutations


class Solution:
    def maxGoodNumber(self, nums: List[int]) -> int:

        max_value = 0

        # nums 배열의 모든 순열 생성
        for arr in permutations(nums):
            # 각 순열의 숫자들을 이진수 문자열로 변환하여 연결
            binary_string = ''.join(map(lambda x: bin(x)[2:], arr))
            # 이진수 문자열을 10진수로 변환하여 최댓값 갱신
            max_value = max(max_value, int(binary_string, 2))

        return max_value


solution = Solution()
nums = [1, 2, 3]
print(solution.maxGoodNumber(nums))
nums = [2, 8, 16]
print(solution.maxGoodNumber(nums))
