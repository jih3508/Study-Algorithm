W, H, X, Y, P = map(int, input().split())
R = H /2
count = 0
for _ in range(P):
    x, y = map(int, input().split())
    if (X - x) ** 2 + (Y + R - y) ** 2 <= R ** 2:
        count += 1
    elif (X + W - x) ** 2 + (Y + R - y) ** 2 <= R ** 2:
        count += 1
    elif x >= X and x <= (X + W) and y >= Y and y <= (Y + H):
        count += 1
print(count)