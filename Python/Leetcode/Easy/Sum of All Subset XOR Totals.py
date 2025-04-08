from typing import List
'''
 - method: Sum of All Subset XOR Totals
 - description: https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
'''
class Solution:
    def __init__(self):
        self.result = 0 # 최종 XOR 합을 저장할 변수

    def subsetXORSum(self, nums: List[int]) -> int:
        size = len(nums) # 배열 nums의 길이

        def subset(index, arr: List[int]):
            xor_sum = 0
            # 현재 배열 arr의 모든 요소를 XOR 연산 후 result에 추가
            for num in arr:
                xor_sum ^= num
            self.result += xor_sum

            # 배열의 크기가 원본 배열 크기와 같아지면 재귀 종료
            if index >= size:
                return

            # idx부터 시작하여 부분집합을 구성
            for i in range(index, size):
                arr.append(nums[i]) # 현재 요소 추가
                subset(i + 1, arr) # 재귀 호출하여 다음 요소 탐색
                arr.pop() # 백트래킹을 위해 마지막 요소 제거

        self.result = 0
        # 0번째 index와 빈 배열로 시작
        subset(0, [])

        return self.result

solution = Solution()
nums = [1, 3]
print(solution.subsetXORSum(nums))
nums = [5,1,6]
print(solution.subsetXORSum(nums))
nums = [3,4,5,6,7,8]
print(solution.subsetXORSum(nums))