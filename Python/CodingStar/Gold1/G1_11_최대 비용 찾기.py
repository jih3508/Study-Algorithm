def maximum(n, matrix):
    mat = [[0] * (n+1) for _ in range(n+1)]
    #���� ������ ����
    di = [1, 0 ,1] 
    dj = [-1, -1, 0]
    for i in range(n-1, -1,-1):
        for j in range(1, n+1):
            m = 0
            for k in range(3):
                fi, fj = i + di[k], j + dj[k]
                if mat[fi][fj] >m :
                    m = mat[fi][fj]
            mat[i][j] = matrix[i][j-1] + m # ���� ū���� �ε��� �迭�̶� ���Ѵ�.
    return mat[0][n] # ���� ������ ���� ��ȯ�Ѵ�.

n = int(input())
data = ','.join(iter(input,''))
matrix1 = [list(map(int, i.split())) for i in data.split(',')] # ��ü �迭�� �� ������ �ڸ�(',')�� �����Ͽ� �д´�.
print(maximum(n, matrix1))