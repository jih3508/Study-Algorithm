import sys
input = sys.stdin.readline

for _ in range(int(input())):
    x1, y1, x2, y2 = map(int, input().split())
    cnt = 0
    for _ in range(int(input())):
        x, y, r = map(int, input().split())
        r *= r
        d1 = (x1 - x) ** 2 + (y1 - y) ** 2
        d2 = (x2 - x) ** 2 + (y2 - y) ** 2
        if d1 < r and d2 < r:
            continue
        elif d1 < r or d2 < r: cnt += 1
    print(cnt)