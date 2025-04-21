from collections import defaultdict, deque
"""
/*
 * - 802. Find Eventual Safe States
 * https://leetcode.com/problems/find-eventual-safe-states/description/
 */
"""
class Solution(object):
    def eventualSafeNodes(self, graph):
        size = len(graph)
        g = defaultdict(list)
        queue = deque([])
        ind = [0 for _ in range(size)]

        # 역방향 그래프 구성 및 진입 차수 계산
        for i in range(size):
            for node in graph[i]:
                g[node].append(i) # 간선 방향 뒤집기
                ind[i] += 1 # 진입 차수 증가
            if len(graph[i]) == 0: #  터미널 노드 식별
                queue.append(i)

        result = []
        # 위상 정렬 수행
        while queue:
            node = queue.popleft()
            result.append(node)

            for next in g[node]:
                ind[next] -= 1
                if ind[next] == 0: # 진입 차수 감소 후 0이면 큐에 추가
                    queue.append(next)

        result.sort()
        return result

solution = Solution()
graph = [[1,2],[2,3],[5],[0],[5],[],[]]
print(solution.eventualSafeNodes(graph))
graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
print(solution.eventualSafeNodes(graph))