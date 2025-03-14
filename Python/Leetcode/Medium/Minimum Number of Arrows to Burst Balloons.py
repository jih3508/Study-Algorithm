from typing import List


class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:

        size = len(points)
        points.sort(key=lambda point: point[1]) # 끝 지점으로 정렬

        count = 1
        arrow = points[0][1]
        for i in range(1, size):
            # 끝 지점이 시작 지점 작을때
            if arrow < points[i][0]:
                count += 1 # 개수 증가
                arrow = points[i][1] # 다시 끝지점으로 위치 설정

        return count


solution = Solution()
points = [[10, 16], [2, 8], [1, 6], [7, 12]]
print(solution.findMinArrowShots(points))
points = [[1, 2], [3, 4], [5, 6], [7, 8]]
print(solution.findMinArrowShots(points))
points = [[1, 2], [2, 3], [3, 4], [4, 5]]
print(solution.findMinArrowShots(points))
points = [[60051528, 100384399], [12805732, 32854561], [78409503, 93939522], [13258270, 86621638], [9959708, 87446423],
          [73226340, 104744489], [747796, 90448519], [17142618, 85144863], [50122846, 89616297], [90892921, 151136476]]
print(solution.findMinArrowShots(points))
points = [[3, 9], [7, 12], [3, 8], [6, 8], [9, 10], [2, 9], [0, 9], [3, 9], [0, 6], [2, 8]]
print(solution.findMinArrowShots(points))
