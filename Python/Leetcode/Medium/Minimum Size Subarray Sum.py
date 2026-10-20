"""
209. Minimum Size Subarray Sum
https://leetcode.com/problems/minimum-size-subarray-sum/description/
"""

class Solution:
    def minSubArrayLen(self, target: int, nums: list[int]) -> int:

        start_index, window_sum = 0, 0
        # 불가능을 뜻하는 센티넬 n + 1 — 0으로 시작하면 Math.min()이 계속 0만 고른다. 마지막에 0으로 되돌림
        min_len = len(nums) + 1

        for end_index, value in enumerate(nums):
            window_sum += value
            # if가 아니라 while — 큰 값 하나가 들어오면 왼쪽 여러 칸을 한꺼번에 밀어낼 수 있다
            # 전부 양수라서 startIndex를 올리면 합이 반드시 줄어든다 → 이 단조성 덕분에 startIndex는 되돌아갈 필요가 없다
            while window_sum >= target:
                # 길이 갱신은 줄이기 전에 — 줄이고 나면 조건이 깨져 있을 수 있다
                min_len = min(end_index - start_index + 1, min_len)
                window_sum -= nums[start_index]
                start_index += 1

        return min_len if min_len != len(nums) + 1 else 0

solution = Solution()
print(solution.minSubArrayLen(7, [2,3,1,2,4,3]))
print(solution.minSubArrayLen(4, [1,4,4]))
print(solution.minSubArrayLen(11, [1,1,1,1,1,1,1,1]))
print(solution.minSubArrayLen(11, [1,2,3,4,5]))