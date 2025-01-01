from typing import List

class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:

        size = len(nums) # nums 배열의 크기
        answer = [0 for _ in range(size)] # 결과를 저장할 배열
        maxNumer = (1 << maximumBit) - 1 # 2^maximumBit - 1 계산 (모든 비트가 1인 값)
        num = nums[0] # nums[0] 값을 초기 num으로 설정
        answer[size - 1] = num ^ maxNumer # 마지막 인덱스에 초기 계산 값 저장

        # 나머지 요소에 대해 반복적으로 XOR 계산
        for i in range(1, size):
            num = num ^ nums[i] # 누적 XOR 계산
            answer[size - i - 1] = num ^ maxNumer # 역순으로 답을 저장

        return answer

solution = Solution()

nums = [0,1,1,3]
print(solution.getMaximumXor(nums, 2))
nums = [2,3,4,7]
print(solution.getMaximumXor(nums, 3))
nums = [0,1,2,2,5,7]
print(solution.getMaximumXor(nums, 3))
