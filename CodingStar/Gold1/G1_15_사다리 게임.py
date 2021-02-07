def game(n, ladder):
    # 방향 설정
    dx = [0,0,1]
    dy = [-1,1,0]
    x, y = 0, (n-1)*2 #출발점 설정
    while ladder[x][y] == '1': # 결과나올때 까지 사다리타기 한다.
        ladder[x][y] = '0' # 지나간 길은 다시 되돌아 갈 수 없게 한다.
        for k in range(3):
            fx, fy = x + dx[k], y + dy[k] # 나갈 위치를 선정한다.
            if 0<=fy<len(ladder[0]) and ladder[fx][fy] == '1': # 사다리 타기 가능한 곳으로 이동한다.
                x, y = fx, fy
                break
    return ladder[x+1][y]

n = int(input())
data = ','.join(iter(input,''))
ladder = [list(i) for i in data.split(',')]
print(game(n, ladder))