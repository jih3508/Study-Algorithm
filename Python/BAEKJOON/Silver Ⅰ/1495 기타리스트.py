n, s, m = map(int, input().split())
valum = [[False for _ in range(m+1)] for _ in range(n + 1)]
valum[0][s] = True
valums = list(map(int, input().split()))

for i in range(n):
    for j in range(m + 1):
        if valum[i][j] == False: continue
        if j - valums[i] >= 0: valum[i + 1][j - valums[i]] = True
        if j + valums[i] <= m: valum[i + 1][j + valums[i]] = True

for i in range(m, -1, -1):
    if valum[n][i] == True: 
        print(i)
        exit()
print(-1)