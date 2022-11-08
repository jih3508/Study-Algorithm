matrix = [list(map(int, input().split())) for _ in range(9)]

max_value = 0
x, y = 0, 0

for i in range(9):
    for j in range(9):
        if max_value < matrix[i][j]:
            max_value = matrix[i][j]
            x, y = i, j

print(max_value)
print(x + 1, y + 1)