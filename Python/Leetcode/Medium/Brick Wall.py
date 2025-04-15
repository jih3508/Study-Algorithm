"""
554. Brick Wall
https://leetcode.com/problems/brick-wall/description/
"""
from typing import List
from collections import defaultdict


class Solution:
    def leastBricks(self, wall: List[List[int]]) -> int:

        size = len(wall) # 벽의 총 행 수
        map = defaultdict(int) # 벽돌 경계의 위치와 그 빈도수를 저장하는 맵

        for i in range(size):
            length = 0 # 현재까지의 누적 길이
            for j in range(len(wall[i]) - 1): # 마지막 벽돌은 벽의 끝이므로 제외
                length += wall[i][j] #  현재 벽돌의 길이를 누적
                map[length] += 1 # 현재 경계 위치의 빈도수를 증가

        return size - max(map.values(), default= 0) # 벽의 전체 행 수에서 최대 경계선을 뺀 값이 최소로 가로지르는 벽돌 수


solution = Solution()
wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
print(solution.leastBricks(wall))
wall = [[1],[1],[1]]
print(solution.leastBricks(wall))