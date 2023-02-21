import sys
input = sys.stdin.readline

N = int(input())
board = [list(map(int, input().split())) for _ in range(N)]
field = [[0] * N for _ in range(N)]
field[0][0] = 1
for i in range(N):
    for j in range(N):
        if board[i][j] == 0: continue
        if 0<= i + board[i][j] < N:
            field[i + board[i][j]][j] += field[i][j]
        if 0 < j + board[i][j] < N:
            field[i][j + board[i][j]] += field[i][j]

print(field[N - 1][N - 1])