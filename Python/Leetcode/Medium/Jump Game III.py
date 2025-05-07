from typing import List
from collections import deque

class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:

        size = len(arr) # 배열의 길이
        visited = [False] * size # 각 인덱스 방문 여부를 추적하기 위한 배열을 초기화

        queue = deque([start]) # BFS(너비 우선 탐색)를 위한 큐를 생성
        visited[start] = True # 시작 인덱스를 큐에 추가하고 방문했다고 표시

        # 큐가 비어있지 않는 동안 반복
        while queue:

            index = queue.popleft() # 큐에서 현재 탐색할 인덱스

            # 현재 인덱스의 값이 0이면 목표에 도달했으므로 true를 반환
            if arr[index] == 0:
                return True

            # 현재 인덱스 값 왼쪽, 오른쪽 위치 계산
            for next_index in (index - arr[index], index + arr[index]):

                # 다음 인덱스 위치가 범위 안 그리고 방문하지 않았다면
                if 0<= next_index < size and not visited[next_index]:
                    # 해당 인덱스를 큐에 추가하고 방문했다고 표시
                    queue.append(next_index)
                    visited[next_index] = True

        # 모든 가능한 점프를 시도했지만 값이 0인 인덱스에 도달하지 못했으므로 false를 반환
        return False

solution = Solution()

arr = [4,2,3,0,3,1,2]
print(solution.canReach(arr, 5))

arr = [4,2,3,0,3,1,2]
print(solution.canReach(arr, 0))

arr = [3,0,2,1,2]
print(solution.canReach(arr, 2))