import sys
input = sys.stdin.readline

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def alpabet(x, y):
    count = 0
    queue = set([(x, y, board[x][y])])
    while queue:
        nx, ny, path = queue.pop()
        count = max(count, len(path))
        for i in range(4):
            fx, fy = nx + dx[i], ny + dy[i]
            if 0 <= fx < R and 0 <= fy < C and board[fx][fy] not in path:
                queue.add((fx, fy , path + board[fx][fy]))
    return count
    
R, C = map(int, input().split())
board = [list(input()) for _ in range(R)]
print(alpabet(0, 0))