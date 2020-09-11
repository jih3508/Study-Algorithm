def matrix_add(a,b):
    n = len(a)
    m = len(a[0])
    result = [[0]*m for _ in range(n)]
    for i in range(n):
        for j in range(m):
            result[i][j] = a[i][j] + b[i][j]
    return result

print(matrix_add([[1,2,3,4,5],[6,7,8,9,10]]
                 ,[[11,12,13,14,15],[16,17,18,19,20]]))