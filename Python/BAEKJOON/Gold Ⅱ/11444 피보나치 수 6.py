def mul_matrix(expo):
    if expo == 1: return matrix  
    result = mul_matrix(expo // 2)
    if (expo %  2) == 1: return mul(mul(result, result), matrix)
    else: return mul(result, result)

def mul(matrix1, matrix2):
    result = [[0] * size for _ in range(size)]
    for i in range(size):
        for j in range(size):
            for k in range(size):
                result[i][j] += (matrix1[k][j] * matrix2[i][k]) % 1000000007
    return result

N  = int(input())
size = 2
matrix = [[1, 1], [1, 0]]
print(mul_matrix(N)[0][1] % 1000000007 if N > 0 else 0)