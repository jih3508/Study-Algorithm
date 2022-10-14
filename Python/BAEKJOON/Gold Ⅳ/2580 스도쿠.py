# 전체 값이 채워져있는지 확인
def is_full(arrays, p):
    for i in range(9):
        for j in range(9):
            if(arrays[i][j] == 0): # 비어 있는 값이 있는 경우 위치 반환
                p[0], p[1] = i, j
                return False
    return True

# 유효 값 확인
def check_value(arrays, row, col, num):
    return check_closs(arrays, row, col, num) and check_box(arrays, row - row % 3, col - col % 3, num)

# 가로, 세로 확인
def check_closs(arrays, row, col, num):
    for i in range(9):
        if(arrays[row][i] == num or arrays[i][col] == num): return False
    return True

# 박스 영역 확인
def check_box(arrays, row, col, num):
    for i in range(3):
        for j in range(3):
            if arrays[row + i][col +j] == num: return False
    return True


def sudoku(arrays):
    p = [0, 0]
    if is_full(arrays, p): return True
    row, col = p[0], p[1]
    for num in range(1, 10):
        if(check_value(arrays, row, col, num)):
            arrays[row][col] = num
            if(sudoku(arrays)): return True;
            arrays[row][col] = 0
    return False
            

matrix = []
for _ in range(9):
    matrix.append(list(map(int, input().split())))

sudoku(matrix)
for i in range(9):
    for j in range(9):
        print(matrix[i][j], end = ' ')
    print()