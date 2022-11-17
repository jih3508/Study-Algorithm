from copy import deepcopy
def game(g, size, field):
    # 방향 설정
    di = [-1,-1, -1, 0,0,1,1,1]
    dj = [-1,0,1,-1,1,-1,0,1]
    for _ in range(g-1):
        new = [[0 for _ in range(size)] for _ in range(size)] # 다음 세대 필드 초기 설정
        for i in range(size):
            for j in range(size):
                cnt = 0 # 갯수 저장하는 변수
                for k in range(8):
                    fi , fj = i + di[k], j + dj[k] # 각 주위 방향
                    if 0<=fi<size and 0<=fj<size and field[fi][fj] == 1:
                        cnt += 1
                new[i][j] = int(cnt == 3 or (cnt == 2 and field[i][j] == 1)) # 조건 맞으면 탄생 또는 생존
        field = deepcopy(new) # 깊은 복사로 다음 세대 저장
    return str(field).count('1') # 전체 생존 갯수 구하기

g = int(input())
size = int(input())
field = [[0 for _ in range(size)] for _ in range(size)] # 초기 필드 생성
located = ','.join(iter(input,''))
for i in located.split(','): # 필드 생존 위치 넣기
    a, b = map(int, i.split())
    field[a][b] = 1
print(game(g,size,field))