def game(m, n, mine):
    #���� ����
    di = [-1, -1, -1, 0, 0, 1, 1, 1]
    dj = [-1, 0, 1, -1, 1, -1, 0, 1]
    for i in range(m):
        line = '' # �� ���� ��� ����
        for j in range(n):
            if mine[i][j] == '@': line += '@' #������ ��� �׳� ���ڷ� ǥ��
            else:
                # ���� �ƴ� ��� ���� ���� �����Ѵ�.
                cnt = 0
                for k in range(8):
                    fi, fj = i + di[k], j + dj[k]
                    if 0<= fi <m and 0<= fj <n and mine[fi][fj] == '@':
                        cnt += 1
                line += str(cnt) # ���� ���� ����� �����Ѵ�.
        print(line) # �� �� ���� ������ ��� �Ѵ�.

m, n = map(int, input().split())
data = ','.join(iter(input,''))
mine = [list(i) for i in data.split(',')]
game(m, n , mine)