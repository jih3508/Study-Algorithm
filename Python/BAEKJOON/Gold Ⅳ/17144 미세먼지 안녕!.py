# 공기청정기 위치
def findAirPurifier(arrays):
    for x in range(2, R):
        for y in range(C):
            if arrays[x][y] == -1:
                return [(x, y), (x + 1, y)]

# 미세먼지 확산 처리
def Spread(arrays):
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    newArrays = [[0] * C for _ in range(R)]
    for x in range(R):
        for y in range(C):
            if arrays[x][y] == 0:
                continue
            elif arrays[x][y] == -1:
                newArrays[x][y] = -1
            else:
                count = 0
                for k in range(4):
                    fx, fy = dx[k] + x, dy[k] + y
                    if 0 <= fx < R and 0 <= fy < C and arrays[fx][fy] != -1:
                        count += 1
                        newArrays[fx][fy] += arrays[x][y] // 5
                newArrays[x][y] += arrays[x][y] - (arrays[x][y] // 5) * count

    return newArrays

# 공기 청정기 작동
def upWorks(arrays):
    i = 0
    move = [(0, 1), (-1, 0), (0, -1), (1, 0)]
    x, y = airPurifier[0]
    y += 1
    value = arrays[x][y]
    arrays[x][y] = 0
    while True:
        if value == -1:
            arrays[x][y] = -1
            break
        #print(x, y, value, i)
        fx, fy = x + move[i][0], y + move[i][1]

        if 0 <= fx <= airPurifier[0][0] and 0 <= fy < C:
            tmp = arrays[fx][fy]
            arrays[fx][fy] = value
            value = tmp
        else:
            i += 1
            continue
        x, y = fx, fy
    return arrays

def downWorks(arrays):
    i = 0
    move = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    x, y = airPurifier[0]
    y += 1
    value = arrays[x][y]
    arrays[x][y] = 0
    while True:
        if value == -1:
            arrays[x][y] = -1
            break
        #print(x, y, value, i)
        fx, fy = x + move[i][0], y + move[i][1]

        if airPurifier[1][0] <= fx < R and 0 <= fy < C:
            tmp = arrays[fx][fy]
            arrays[fx][fy] = value
            value = tmp
        else:
            i += 1
            continue
        x, y = fx, fy
    return arrays

R, C, T = map(int,input().split())

boards = [list(map(int,input().split())) for _ in range(R)]
airPurifier = findAirPurifier(boards)
for _ in range(T):
    boards = Spread(boards)
    boards = upWorks(boards)
    boards = downWorks(boards)


for board in boards:
    print(board)

print(sum([sum(board) for board in boards]) + 2)