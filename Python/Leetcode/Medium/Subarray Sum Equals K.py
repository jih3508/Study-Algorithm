from typing import List

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        # 음수가 섞이면 구간을 줄여도 합이 줄어든다는 보장이 없어서 슬라이딩 윈도우를 못 쓴다
        # 대신 '지금 누적합 - 예전 누적합'으로 구간 합을 구한다
        prefix_sum = 0

        # 누적합 → 나온 횟수. Set이 아니라 횟수여야 한다 — 0이나 음수 때문에 같은 누적합이 여러 번 나올 수 있고,
        # 나온 횟수만큼 서로 다른 시작점이 있다
        prefix_sum_dic = {0: 1}

        # 아무것도 더하기 전의 누적합 0을 미리 1번 등록 — 없으면 0번 인덱스에서 시작하는 구간을 전부 놓친다.
        count = 0
        for num in nums:
            prefix_sum += num

            # 구간 합 = 지금 누적합 - 시작 직전 누적합 → 합이 k이려면 시작 직전 누적합이 prefixSum - k여야 한다
            # 그 값이 앞에서 나온 횟수 = 지금 위치에서 끝나는 합 k 구간의 개수
            count += prefix_sum_dic.get(prefix_sum - k, 0)

            # 조회 다음에 기록 — 먼저 넣으면 k = 0일 때 방금 넣은 자기 자신과 짝지어져 길이 0 구간까지 센다
            prefix_sum_dic[prefix_sum] = prefix_sum_dic.get(prefix_sum , 0) + 1

        return count

solution = Solution()
print(solution.subarraySum(nums=[1,1,1], k=2))
print(solution.subarraySum(nums=[1,2,3], k=3))
print(solution.subarraySum(nums=[1,-1,0], k=0))
print(solution.subarraySum(nums=[1,2,3], k=3))


