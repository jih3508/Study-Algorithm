def rotate_a_matrix_by_90_degree(a):
    n = len(a)
    m = len(a[0])
    result = [[0]*n for _ in range(m)]
    for i in range(n):
        for j in range(m):
            result[j][n-i-1]= a[i][j]
    return result

print(rotate_a_matrix_by_90_degree([[0, 0, 0], [1, 0, 0], [0, 1, 1]]))