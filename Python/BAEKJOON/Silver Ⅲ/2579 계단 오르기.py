import sys

input = sys.stdin.readline

n = int(input())
array = [int(input()) for _ in range(n)]
dp = []


dp.append(array[0])
if n == 1:
    print(dp[0])
    exit()
dp.append(max(array[0], array[0] + array[1]))
if n == 2:
    print(dp[1])
    exit()
dp.append(max(array[0] + array[2], array[1] + array[2]))

for i in range(3, n):
    dp.append(max(dp[i-2] + array[i], dp[i-3] + array[i] + array[i-1]))
    
print(dp.pop())