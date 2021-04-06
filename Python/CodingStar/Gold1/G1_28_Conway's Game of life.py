from copy import deepcopy
def game(g, size, field):
    # ���� ����
    di = [-1,-1, -1, 0,0,1,1,1]
    dj = [-1,0,1,-1,1,-1,0,1]
    for _ in range(g-1):
        new = [[0 for _ in range(size)] for _ in range(size)] # ���� ���� �ʵ� �ʱ� ����
        for i in range(size):
            for j in range(size):
                cnt = 0 # ���� �����ϴ� ����
                for k in range(8):
                    fi , fj = i + di[k], j + dj[k] # �� ���� ����
                    if 0<=fi<size and 0<=fj<size and field[fi][fj] == 1:
                        cnt += 1
                new[i][j] = int(cnt == 3 or (cnt == 2 and field[i][j] == 1)) # ���� ������ ź�� �Ǵ� ����
        field = deepcopy(new) # ���� ����� ���� ���� ����
    return str(field).count('1') # ��ü ���� ���� ���ϱ�

g = int(input())
size = int(input())
field = [[0 for _ in range(size)] for _ in range(size)] # �ʱ� �ʵ� ����
located = ','.join(iter(input,''))
for i in located.split(','): # �ʵ� ���� ��ġ �ֱ�
    a, b = map(int, i.split())
    field[a][b] = 1
print(game(g,size,field))