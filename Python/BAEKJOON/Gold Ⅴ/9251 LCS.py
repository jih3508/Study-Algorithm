X = input()
Y = input()
xLenth = len(X)
yLenth = len(Y)

dp = [[0] * (yLenth + 1) for _ in range(xLenth + 1)]

for i in range(1, xLenth + 1):
    for j in range(1, yLenth + 1):
        if X[i - 1] == Y[j - 1]:
            dp[i][j] = dp[i - 1][j - 1] + 1
        else:
            dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])

print(dp[xLenth][yLenth])