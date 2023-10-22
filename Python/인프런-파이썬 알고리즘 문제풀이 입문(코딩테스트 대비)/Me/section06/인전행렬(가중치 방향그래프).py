N, M = map(int, input().split())
adj = [[0] * N for _ in range(N)]

for _ in range(M):
    a, b, distance = map(int, input().split())
    adj[a-1][b-1] = distance

for arr in adj:
    print(' '.join(map(str, arr)))