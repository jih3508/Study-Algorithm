def z(k, x, y):
    global count
    if x == r and y == c:
        print(int(count))
        return

    if k == 1:
        count += 1
        return

    if not (x <= r < x + k and y <= c < y + k):
        count += k * k
        return
    
    for i in range(4):
        z(k//2,  x+dx[i] * k//2, y+dy[i] * k//2)

dx = [0, 0, 1, 1]
dy = [0, 1, 0, 1]
n, r, c = map(int, input().split())
count = 0
z(2**(n), 0, 0)