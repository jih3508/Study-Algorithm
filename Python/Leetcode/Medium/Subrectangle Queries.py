class SubrectangleQueries:

    # 2차원 리스트 초기화
    def __init__(self, rectangle: list[list[int]]):
        self.rectangle = rectangle

    # 범위안에 값 갱신
    def updateSubrectangle(self, row1: int, col1: int, row2: int, col2: int, newValue: int) -> None:
        for i in range(row1, row2 + 1):
            for j in range(col1, col2 + 1):
                self.rectangle[i][j] = newValue

    # 위치에 있는 값 출력
    def getValue(self, row: int, col: int) -> int:
        return self.rectangle[row][col]

print("#case1")
srq = SubrectangleQueries([[1,2,1],[4,3,4],[3,2,1],[1,1,1]])
print(srq.getValue(0, 2))
srq.updateSubrectangle(0,0,3,2,5)
print(srq.getValue(0, 2))
print(srq.getValue(3, 1))
srq.updateSubrectangle(3,0,3,2,10)
print(srq.getValue(3, 1))
print(srq.getValue(0, 2))

print("#case2")
srq = SubrectangleQueries([[1,1,1],[2,2,2],[3,3,3]])
print(srq.getValue(0, 0))
srq.updateSubrectangle(0,0,2,2,100)
print(srq.getValue(0, 0))
print(srq.getValue(2, 2))
srq.updateSubrectangle(1,1,2,2,20)
print(srq.getValue(2, 2))