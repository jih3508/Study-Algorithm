N, M = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]
M, K = map(int, input().split())
B =[list(map(int, input().split())) for _ in range(M)]
result = [[0] * K for _ in range(N)]

#  행렬 연산
for i in range(N):
    for j in range(K):
        for x in range(M):
            result[i][j] += A[i][x] * B[x][j]

for array in result:
    print(' '.join(map(str, array)))