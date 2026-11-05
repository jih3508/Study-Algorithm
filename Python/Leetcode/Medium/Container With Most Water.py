class Solution:
    def maxArea(self, height: list[int]) -> int:

        left, right, max_area = 0, len(height) - 1, 0

        # 폭이 가장 넓은 양 끝에서 시작해, 폭을 줄여 가며 높이로 만회할 기회를 찾는다
        while left < right:
            # 물 높이는 낮은 쪽 벽이 결정한다 — 높은 쪽에 맞추면 넘친다
            h = min(height[left], height[right])
            max_area = max(max_area, h * (right - left))

            # 낮은 쪽을 움직이는 이유: 높은 쪽을 옮기면 폭은 줄고
            # 높이는 여전히 낮은 쪽에 묶여 넓이가 절대 커질 수 없다
            if height[left] < height[right]:
                left += 1
            else:
                # 높이가 같으면 어느 쪽을 옮겨도 최댓값을 놓치지 않는다
                right -= 1

        return max_area


solution = Solution()
print(solution.maxArea([1,8,6,2,5,4,8,3,7]))
print(solution.maxArea([1,1]))