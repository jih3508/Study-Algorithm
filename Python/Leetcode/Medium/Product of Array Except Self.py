"""
문제: Product of Array Except Self
url: https://leetcode.com/problems/product-of-array-except-self/description
"""
class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:

        size = len(nums)

        # 결과 배열을 왼쪽 곱 저장소로 먼저 쓴다 — 별도 right[] 배열을 만들지 않으려는 것
        prefix_mul = [0] * size

        # 0번 위치는 왼쪽에 곱할 원소가 없다 — 곱셈의 항등원 1로 시작해야 이후 누적이 깨지지 않음
        prefix_mul[0] = 1

        for i in range(1, size):
            # nums[i]가 아니라 nums[i - 1] — "i 직전까지"의 곱이어야 자기 자신이 빠진다
            prefix_mul[i] = prefix_mul[i - 1] * nums[i - 1]

        # 오른쪽 곱은 배열 대신 변수 하나로 이어간다 — 뒤에서 앞으로 한 번만 훑으면 되기 때문
        # int로 충분한 건 접미사 곱이 32비트에 들어온다는 보장 덕분 (보장 없는 변형 문제는 long 필요)
        right = 1
        for i in range(size - 1, -1, - 1):
            # 순서가 핵심: 결과에 먼저 곱하고, 그 다음에 nums[i]를 right에 합친다
            # 순서를 바꾸면 nums[i] 자신이 결과에 한 번 더 곱해진다
            prefix_mul[i] *= right
            right *= nums[i]

        return prefix_mul


solution = Solution()
print(solution.productExceptSelf([1,2,3,4]))
print(solution.productExceptSelf([-1,1,0,-3,3]))