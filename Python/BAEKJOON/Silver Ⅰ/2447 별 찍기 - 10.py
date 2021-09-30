def star(x, y, k):
    if k < 1: return
    for i in range(k):
        for j in range(k):
            matrixs[x + k + i][y + k + j]=' '
    for i in range(3):
        for j in range(3):
            star(x + i * k, y + j * k, k//3)
    
n = int(input())

matrixs = [['*' for _ in range(n)] for _ in range(n)]
star(0, 0, n // 3)
for matrix in matrixs:
    print(''.join(matrix))