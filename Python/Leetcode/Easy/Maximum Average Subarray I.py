class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:

        """
        길이 k인 연속 구간 중 평균이 최대인 값을 구한다.

        nums: 정수 배열
        k: 구간 길이 (1 ≤ k ≤ len(nums))
        """
        # 첫 창은 직접 더해 둔다 — 이후 창은 이 합에서 한 칸씩 갱신한다
        window_sum = 0
        for i in range(k):
            window_sum += nums[i]

        # 길이가 k로 고정이라 합이 최대인 창이 곧 평균이 최대인 창이다
        # 그래서 나눗셈은 루프 밖에서 한 번만 한다
        max_sum = window_sum
        for i in range(k, len(nums)):
            # 빠지는 nums[i - k]를 빼고 들어오는 nums[i]를 더해
            # 창 하나를 O(1)에 갱신한다 — 매번 k개를 다시 더하면 O(nk)
            window_sum += nums[i] - nums[i - k]
            max_sum = max(max_sum, window_sum)

        # 파이썬 3의 /는 항상 실수 나눗셈이다
        # //를 쓰면 몫만 남아 소수점이 잘린다
        return max_sum / k



solution = Solution()
print(solution.findMaxAverage([1, 12, -5, -6, 50, 3], 4))
print(solution.findMaxAverage([5], 1))
