from collections import deque

class Solution:
    def findCircleNum(self, isConnected: list[list[int]]) -> int:

        # 초기세팅
        adj = isConnected
        size = len(isConnected) # 노드 개수
        visited = [False] * size # 방문여부

        # bfs 탐색
        def bfs(node):
            queue = deque([node])

            while queue:
                current = queue.popleft() # 현재 노드

                for i in range(size):
                    # 자기 자신일때 Pass
                    if i == current:
                        continue
                    # 연결 노드와 방문 하지 않았을때 노드 이동
                    elif (adj[current][i] and not visited[i]):
                        queue.append(i)
                        visited[i] = True

        count = 0 # 개수
        for i in range(size):
            # 방문하지 않았을때 bfs 탐색하고 개수를 늘린다.
            if not visited[i]:
                bfs(i)
                count += 1

        return count


solution = Solution()
print(solution.findCircleNum([[1,1,0],[1,1,0],[0,0,1]]))