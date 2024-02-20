size = 9

def printSudoku(arrays):
    for array in arrays:
        print(''.join(map(str, array)))


def isBlank(arrays):
    global x, y
    for i in range(size):
        for j in range(size):
            if(arrays[i][j] == 0):
                x, y = i, j
                return False
    return True

def checkedCross(row, col, num, arrays):
    for k in range(size):
        if(arrays[row][k] == num or arrays[k][col] == num):
            return False
    return True

def checkedBox(row, col, num, arrays):
    for i in range(3):
        for j in range(3):
            if(arrays[row + i][col + j] == num):
                return False
    return True

def checked(row, col, num, arrays):
    return checkedCross(row, col, num, arrays) and checkedBox(row - row % 3, col - col % 3, num, arrays)


def sudoku(arrays):
    global x, y
    if(isBlank(arrays)):
        printSudoku(arrays)
        exit()
    else:
        row, col = x, y
        for num in range(1, size+1):
            if(checked(row, col, num, arrays)):
                arrays[row][col] = num
                sudoku(arrays)
                arrays[row][col] = 0


arrays = [list(map(int, list(input()))) for _ in range(size)]
sudoku(arrays)