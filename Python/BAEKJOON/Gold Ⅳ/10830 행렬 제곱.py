def mul_matrix(expo):
    if expo == 1: return matrix  
    result = mul_matrix(expo // 2)
    if (expo %  2) == 1: return mul(mul(result, result), matrix)
    else: return mul(result, result)

def mul(matrix1, matrix2):
    result = [[0] * N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            for k in range(N):
                result[i][j] += (matrix1[k][j] * matrix2[i][k]) % 1000
    return result
    

N, B = map(int, input().split())
matrix = [list(map(int, input().split())) for _ in range(N)]
for array in mul_matrix(B):
    print(' '.join(map(lambda x: str(x % 1000), array)))