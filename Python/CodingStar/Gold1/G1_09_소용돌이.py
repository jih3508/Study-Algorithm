row, col = map(int, input().split())
# ����Ʈ ����
matrix = [[-1 for _ in range(col+2)] for _ in  range(row+2)] 
# ������ ��� ���� ����ؼ� �ܺθ� -1�� padding �Ѵ�. 
for i in range(1, row+1):
    for j in range(1, col + 1):
        matrix[i][j] = 0
# x,y ���� ���� �Ѵ�.
dx = [0,1,0,-1]
dy = [1,0,-1,0]
x, y = 1, 1 # ��� ��ġ
k = 0
for num in range(1, row * col+1):
    matrix[x][y] = num
    fx, fy = x + dx[k], y + dy[k] # ���� ��ġ�� ���Ѵ�.
    if matrix[fx][fy] != 0: k = (k+1)%4 # ���� ���� ��ġ�� ������ ����� ���� �������� ����.
    x, y = x + dx[k], y + dy[k]
#���
for i in range(1, row+1):
    for j in range(1, col+1):
        print("%4d"%matrix[i][j], end='')
    print()