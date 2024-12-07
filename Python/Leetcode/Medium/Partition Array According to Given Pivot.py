from typing import List


class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:

        before = []  # pivot 이전 담을 리스트
        middle = []  # pivot 값 담을 리스트
        after = []  # pivot 이후 담을 리스트

        # pivot 기준으로 분기 처리
        for num in nums:
            # pivot 값 보다 클때
            if (num > pivot):
                after.append(num)
            # pivot 값 같을때
            elif (num == pivot):
                middle.append(num)
            # pivot 값 보다 작을때
            else:
                before.append(num)

        '''
        값 추가한 순서
        pivot 이전값 → pivot 값 → pivot 값 이후 순서 대로 저장
        '''
        return before + middle + after


solutio = Solution()
nums = [9, 12, 5, 10, 14, 3, 10]
print(solutio.pivotArray(nums, 10))

nums = [-3, 4, 3, 2]
print(solutio.pivotArray(nums, 2))
