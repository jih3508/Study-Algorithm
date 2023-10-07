N = int(input())

board = [list(map(int, input().split())) for _ in range(N)]

# 회전
for _ in range(int(input())):
    row, direction, count = map(int, input().split())
    for _ in range(count):
        if direction:
            board[row - 1].insert(0, board[row - 1].pop())
        else:
            board[row - 1].append(board[row - 1].pop(0))

center = N //2
result = 0
#모래시계
for i in range(N):
    #print((i , N - i) if i <= center else (N - i - 1, i + 1))
    #print((board[i][i: N - i]) if i <= center else board[i][N - i - 1 : i + 1])
    result += sum(board[i][i: N - i]) if i <= center else sum(board[i][N - i - 1 : i + 1])
print(result)