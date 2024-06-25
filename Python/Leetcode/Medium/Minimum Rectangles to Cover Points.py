class Solution:
    def minRectanglesToCoverPoints(self, points: list[list[int]], w: int) -> int:

        points.sort() # 위치 x 축 기준으로 정렬
        count = 1 # 개수
        startLocation = points[0][0] # x축 시작위치

        for point in points[1:]:
            # 사각형 범위 범어날때
            # 개수 +1, 시작 위치를 x좌표 값으로 지정한다.
            if point[0] > startLocation + w:
                count += 1
                startLocation = point[0]
        return count


solution = Solution()
print(solution.minRectanglesToCoverPoints([[2,1],[1,0],[1,4],[1,8],[3,5],[4,6]], 1))
print(solution.minRectanglesToCoverPoints([[0,0],[1,1],[2,2],[3,3],[4,4],[5,5],[6,6]], 2))
print(solution.minRectanglesToCoverPoints([[2,3],[1,2]], 0))
