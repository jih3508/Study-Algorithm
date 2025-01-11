def solution(n, computers):

    # 방문 여부를 저장하는 리스트
    # 모든 컴퓨터를 처음엔 방문하지 않은 상태로 초기화
    visited = [False for _ in range(n)]

    def dfs(node):
        visited[node] = True # 현재 노드를 방문 처리

        for i in range(n):
            # 연결되어 있고 아직 방문하지 않은 노드에 대해 다음 노드 탐색
            if computers[node][i] and not visited[i]:
                dfs(i)

    count = 0 # 네트워크의 개수를 저장할 변수

    for i in range(n):

        # 해당 컴퓨터를 아직 방문하지 않았으면 탐색하고 네트워크 개수 추가
        if(not visited[i]):
            dfs(i)
            count += 1

    return count


computers = [[1, 1, 0], [1, 1, 0], [0, 0, 1]]
print(solution(3, computers))
computers = [[1, 1, 0], [1, 1, 1], [0, 1, 1]]
print(solution(3, computers))