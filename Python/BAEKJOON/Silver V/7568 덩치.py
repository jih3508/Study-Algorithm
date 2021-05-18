n = int(input())
bmp = [list(map(int, input().split())) for _ in range(n)]
rank = []
for i in bmp:
    cnt = 1
    for j in bmp:
        cnt += i[0] < j[0] and i[1] < j[1]
    rank.append(cnt)

print(' '.join(map(str, rank)))