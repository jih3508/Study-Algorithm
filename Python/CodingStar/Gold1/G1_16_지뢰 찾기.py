def game(m, n, mine):
    #방향 설정
    di = [-1, -1, -1, 0, 0, 1, 1, 1]
    dj = [-1, 0, 1, -1, 1, -1, 0, 1]
    for i in range(m):
        line = '' # 각 행을 결과 변수
        for j in range(n):
            if mine[i][j] == '@': line += '@' #지뢰인 경우 그냥 지뢰로 표시
            else:
                # 지뢰 아닌 경우 주위 지뢰 조사한다.
                cnt = 0
                for k in range(8):
                    fi, fj = i + di[k], j + dj[k]
                    if 0<= fi <m and 0<= fj <n and mine[fi][fj] == '@':
                        cnt += 1
                line += str(cnt) # 주위 지뢰 결과를 저장한다.
        print(line) # 한 줄 조사 끝나면 출력 한다.

m, n = map(int, input().split())
data = ','.join(iter(input,''))
mine = [list(i) for i in data.split(',')]
game(m, n , mine)