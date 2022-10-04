for _ in range(int(input())):
    east, west =  map(int, input().split())
    dp = [[1] * (west + 1) for _ in range(west + 1)]
    
    for i in range(2,  west+ 1):
        for j in range(1, i):
            dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1])
    
    print(dp[west][east])