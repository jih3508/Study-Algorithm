def maximum(n, matrix):
    mat = [[0] * (n+1) for _ in range(n+1)]
    #방향 데이터 설정
    di = [1, 0 ,1] 
    dj = [-1, -1, 0]
    for i in range(n-1, -1,-1):
        for j in range(1, n+1):
            m = 0
            for k in range(3):
                fi, fj = i + di[k], j + dj[k]
                if mat[fi][fj] >m :
                    m = mat[fi][fj]
            mat[i][j] = matrix[i][j-1] + m # 가장 큰값과 인덱스 배열이랑 합한다.
    return mat[0][n] # 최종 목적지 값을 반환한다.

n = int(input())
data = ','.join(iter(input,''))
matrix1 = [list(map(int, i.split())) for i in data.split(',')] # 전체 배열을 줄 단위로 코마(',')로 구분하여 읽는다.
print(maximum(n, matrix1))