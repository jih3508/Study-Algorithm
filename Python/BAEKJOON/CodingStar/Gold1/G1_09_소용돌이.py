row, col = map(int, input().split())
# 리스트 선언
matrix = [[-1 for _ in range(col+2)] for _ in  range(row+2)] 
# 범위를 벗어날 경우로 대비해서 외부를 -1로 padding 한다. 
for i in range(1, row+1):
    for j in range(1, col + 1):
        matrix[i][j] = 0
# x,y 방향 설정 한다.
dx = [0,1,0,-1]
dy = [1,0,-1,0]
x, y = 1, 1 # 출발 위치
k = 0
for num in range(1, row * col+1):
    matrix[x][y] = num
    fx, fy = x + dx[k], y + dy[k] # 앞의 위치를 구한다.
    if matrix[fx][fy] != 0: k = (k+1)%4 # 만약 앞의 위치가 범위가 벗어나면 다음 방향으로 간다.
    x, y = x + dx[k], y + dy[k]
#출력
for i in range(1, row+1):
    for j in range(1, col+1):
        print("%4d"%matrix[i][j], end='')
    print()