import sys
input = sys.stdin.readline
INF = 1e9

def Bellman_Ford():
    distances = [INF] * (N + 1)
    
    # 라운드 마다 진행
    for i in range(N):
        
        # 각 간선
        for j in range(len(edges)):
            current_node, next_node, cost = edges[j]
            
            if distances[next_node] > distances[current_node] + cost:
                distances[next_node] = distances[current_node] + cost
                # n번째 라운드에서도 값이 갱신된다면 음수 순환이 존재
                if i == N - 1: return True
    
    return False
                
        
for _ in range(int(input())):
    N, M, W = map(int, input().split())
    edges = []
    for _ in range(M):
        S, E, T = map(int, input().split())
        edges.append((S, E, T))
        edges.append((E, S, T))
    for _ in range(W):
        S, E, T = map(int, input().split())
        edges.append((S, E, -T))
    
    print('YES' if Bellman_Ford() else 'NO')