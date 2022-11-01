import sys
input = sys.stdin.readline

n = int(input())
array = [int(input()) for _ in range(n)]

dp = [array[0]]

if n > 1:
    dp.append(array[0] + array[1])
if n > 2:
    dp.append(max(array[2] + array[1], array[2] + array[0], dp[1]))
for i in range(3, n):
    dp.append(max(array[i] + array[i-1] + dp[i-3], array[i] + dp[i-2], dp[i-1]))

print(dp[-1])