n = int(input())
for _ in range(n):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    r = ((x1-x2)** 2 + (y1 - y2) ** 2) ** (1/2)
    Round = [r, r1, r2]
    m = max(Round)
    Round.remove(m)
    if(r == 0 and r1 == r2):  print(-1)
    elif(r1 + r2 == r or sum(Round) == m):  print(1)
    elif(sum(Round) < m): print(0)
    else: print(2)