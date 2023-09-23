board = [list(map(int, input().split())) for _ in range(7)]

count = 0
# 행
for x in range(7):
    for y in range(3):
        count += board[x][y: y + 5] == board[x][y: y + 5][::-1]
        #print(board[x][y: y + 5], board[x][y: y + 5][::-1], board[x][y: y + 5] == board[x][y: y + 5][::-1])

# 열
for x in range(3):
    for y in range(7):
        cols = [board[x + i][y] for i in range(5)]
        count += cols == cols[::-1]
        #print(cols, cols[::-1], cols == cols[::-1])

print(count)