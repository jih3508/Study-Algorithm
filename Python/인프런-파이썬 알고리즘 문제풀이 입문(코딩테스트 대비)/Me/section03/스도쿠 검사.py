board = [list(map(int, input().split())) for _ in range(9)]

isSudoku = True

# 행, 열
for i in range(9):
    rows = board[i]
    cols = [board[i][j] for j in range(9)]
    if len(set(rows)) < 9 and len(set(cols)) < 9:
        isSudoku = False
        break

# 3 * 3 board
for x in range(0, 9, 3):
    for y in range(0, 9, 3):
        threeBoard = set({})
        for i in range(3):
            for j in range(3):
                threeBoard.add(board[x + i][y + j])
        if len(threeBoard) < 9:
            isSudoku = False
            break

print('YES' if isSudoku else 'NO')