from copy import deepcopy
def life(m, n, matrix):
    #방향 설정
    di = [-1, -1, -1, 0, 0, 1, 1, 1]
    dj = [-1, 0, 1, -1, 1, -1, 0, 1]
    for _ in range(n):
        new = [[0] * m for _ in range(m)]
        for i in range(m):
            for j in range(m):
                cnt = 0
                for k in range(8):
                    fi, fj = i + di[k], j + dj[k]
                    cnt += int(0<= fi < m and 0<= fj < m and matrix[fi][fj] == 1)
                new[i][j] = int(cnt == 3 or (cnt == 2 and matrix[i][j] == 1))
        matrix = deepcopy(new) #다음 보초 저장
    for i in matrix:
        print(''.join(map(str, i)))

m, n = map(int, input().split())
data = ','.join(iter(input,''))
matrix = [list(map(int, i.split())) for i in data.split(',')]
life(m, n, matrix)