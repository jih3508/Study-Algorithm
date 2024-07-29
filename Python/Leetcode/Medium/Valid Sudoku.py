class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        # 가로, 세로 중복 숫자 찾는 함수
        def isCross(x, y, num):
            for i in range(9):
                if (i != y and board[x][i] == num) or (i != x and board[i][y] == num):
                    return False
            return True

        # 박스안에 중복 숫 찾는 함수
        def isBox(x, y, num):
            # 박스 가로, 세로 시작점
            boxX = x - (x % 3)
            boxY = y - (y % 3)

            for i in range(3):
                for j in range(3):
                    if ((boxX + i != x) and (boxY + j != y)) and board[boxX + i][boxY + j] == num:
                        return False

            return True

        # 스토쿠 유효하는 판단하는 함수
        def isSudoku(x, y, num):
            return isCross(x, y, num) and isBox(x, y, num)

        for i in range(9):
            for j in range(9):
                # 유효하지 않는 스토구는 바로 반환한다.
                if board[i][j] != '.' and (not isSudoku(i, j, board[i][j])):
                    return False

        return True


solution = Solution()
board = [["5", "3", ".", ".", "7", ".", ".", ".", "."]
    , ["6", ".", ".", "1", "9", "5", ".", ".", "."]
    , [".", "9", "8", ".", ".", ".", ".", "6", "."]
    , ["8", ".", ".", ".", "6", ".", ".", ".", "3"]
    , ["4", ".", ".", "8", ".", "3", ".", ".", "1"]
    , ["7", ".", ".", ".", "2", ".", ".", ".", "6"]
    , [".", "6", ".", ".", ".", ".", "2", "8", "."]
    , [".", ".", ".", "4", "1", "9", ".", ".", "5"]
    , [".", ".", ".", ".", "8", ".", ".", "7", "9"]]
print(solution.isValidSudoku(board))

board = [["8", "3", ".", ".", "7", ".", ".", ".", "."]
    , ["6", ".", ".", "1", "9", "5", ".", ".", "."]
    , [".", "9", "8", ".", ".", ".", ".", "6", "."]
    , ["8", ".", ".", ".", "6", ".", ".", ".", "3"]
    , ["4", ".", ".", "8", ".", "3", ".", ".", "1"]
    , ["7", ".", ".", ".", "2", ".", ".", ".", "6"]
    , [".", "6", ".", ".", ".", ".", "2", "8", "."]
    , [".", ".", ".", "4", "1", "9", ".", ".", "5"]
    , [".", ".", ".", ".", "8", ".", ".", "7", "9"]]

print(solution.isValidSudoku(board))

board = [[".","4",".",".",".",".",".",".","."]
        ,[".",".","4",".",".",".",".",".","."]
        ,[".",".",".","1",".",".","7",".","."]
        ,[".",".",".",".",".",".",".",".","."]
        ,[".",".",".","3",".",".",".","6","."]
        ,[".",".",".",".",".","6",".","9","."]
        ,[".",".",".",".","1",".",".",".","."]
        ,[".",".",".",".",".",".","2",".","."]
        ,[".",".",".","8",".",".",".",".","."]]

print(solution.isValidSudoku(board))