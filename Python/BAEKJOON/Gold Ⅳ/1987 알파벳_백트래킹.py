import sys
input = sys.stdin.readline

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def alpabet(x, y, road):
    global count
    for i in range(4):
        fx, fy = x + dx[i], y + dy[i]
        if 0 <= fx < R and 0 <= fy < C and board[fx][fy] not in road:
            road.add(board[fx][fy])
            alpabet(fx, fy, road)
            road.remove(board[fx][fy])
    count = max(count, len(road))
    
R, C = map(int, input().split())
board = [list(input()) for _ in range(R)]
count = 0
alpabet(0, 0, set({board[0][0]}))
print(count)