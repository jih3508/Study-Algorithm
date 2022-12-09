def NM(n, arr = []):
    if n == M:
        print(' '.join(map(str, arr)))
        return
    for i in range(N):
        if not visited[i]:
            visited[i] = True
            NM(n + 1, arr + [array[i]])
            visited[i] = False
    
N, M = map(int, input().split())
array = list(map(int, input().split()))
array.sort()
visited = [False] * N
NM(0)