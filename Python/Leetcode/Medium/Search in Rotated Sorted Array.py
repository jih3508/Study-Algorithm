class Solution:
    def search(self, nums: list[int], target: int) -> int:
        left = 0 # 왼쪽
        right = len(nums) - 1 # 오른쪽

        # 이진탐색 시작
        while left <= right:
            mid = (left + right) // 2 # 중간값 계산
            # 찾았을때 위치 반환
            if target == nums[mid]:
                return mid

            # 왼쪽 - 중간이 정렬 되어 있을때
            elif nums[left] <= nums[mid]:
                # 왼쪽 - 중간안에 target이 있을 경우
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
            # 중간 - 오른쪽이 정렬 되어 있을때
            else:
                # 중간 - 오른쪽 사이에 값이 존재 할때
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1
        return -1


solution = Solution()
nums = [4, 5, 6, 7, 8, 1, 2, 3]
print(solution.search(nums, 8))
