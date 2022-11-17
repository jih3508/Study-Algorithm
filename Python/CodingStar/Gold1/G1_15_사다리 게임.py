def game(n, ladder):
    # ���� ����
    dx = [0,0,1]
    dy = [-1,1,0]
    x, y = 0, (n-1)*2 #����� ����
    while ladder[x][y] == '1': # ������ö� ���� ��ٸ�Ÿ�� �Ѵ�.
        ladder[x][y] = '0' # ������ ���� �ٽ� �ǵ��� �� �� ���� �Ѵ�.
        for k in range(3):
            fx, fy = x + dx[k], y + dy[k] # ���� ��ġ�� �����Ѵ�.
            if 0<=fy<len(ladder[0]) and ladder[fx][fy] == '1': # ��ٸ� Ÿ�� ������ ������ �̵��Ѵ�.
                x, y = fx, fy
                break
    return ladder[x+1][y]

n = int(input())
data = ','.join(iter(input,''))
ladder = [list(i) for i in data.split(',')]
print(game(n, ladder))