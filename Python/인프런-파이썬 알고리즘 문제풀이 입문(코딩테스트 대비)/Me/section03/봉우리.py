dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

N = int(input())
board = [[0] * (N + 2) for _ in range(N + 2)]
for i in range(N):
    for index, num in enumerate(list(map(int, input().split()))):
        board[i + 1][index + 1] = num

result = []
for x in range(1, N + 1):
    for y in range(1, N + 1):
        flag = True
        for i in range(4):
            fx, fy = x + dx[i], y + dy[i]
            if board[x][y] <= board[fx][fy]:
                flag = False
                break
        if flag:
            result.append(board[x][y])

print(len(result))