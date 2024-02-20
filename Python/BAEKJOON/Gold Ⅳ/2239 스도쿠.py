size = 9 # 가로, 세로 크기 확인

# 스도쿠 결과 출력
def printSudoku(arrays):
    for array in arrays:
        print(''.join(map(str, array)))

# 스도쿠 비어 있는지 찾기
def isBlank(arrays):
    global x, y
    for i in range(size):
        for j in range(size):
            # 빈값이면 빈 값 위치지정 하고 반환 한다.
            if(arrays[i][j] == 0):
                x, y = i, j
                return False
    return True

# 가로, 세로 중복값 있는지 확인
def checkedCross(row, col, num, arrays):
    for k in range(size):
        if(arrays[row][k] == num or arrays[k][col] == num):
            return False
    return True

# 박스 영역안 중복값 있는지 확인
def checkedBox(row, col, num, arrays):
    for i in range(3):
        for j in range(3):
            if(arrays[row + i][col + j] == num):
                return False
    return True

# 스도쿠 조건 맞으면 참으로 반환 한다.
def checked(row, col, num, arrays):
    return checkedCross(row, col, num, arrays) and checkedBox(row - row % 3, col - col % 3, num, arrays)


def sudoku(arrays):
    global x, y
    # 빈값있는지 확인하고 없으면 스도쿠 출력하고 종료한다.
    if(isBlank(arrays)):
        printSudoku(arrays)
        exit()
    else:
        row, col = x, y
        for num in range(1, size+1):
            # 1부터 9까지 대입해보고 중복값이 없으면 값을 집어 넣고 다음 진행한다.
            if(checked(row, col, num, arrays)):
                arrays[row][col] = num
                sudoku(arrays)
                arrays[row][col] = 0


arrays = [list(map(int, list(input()))) for _ in range(size)]
sudoku(arrays)