dp = [0] * 11
dp[1] = 1
dp[2] = 2
dp[3] = 4
for i in range(4, 11):
    dp[i] = sum(dp[i - 3:i])

for _ in range(int(input())): 
    print(dp[int(input())])
