import sys
input = sys.stdin.readline
n = int(input())

wires = [list(map(int, input().split())) for _ in range(n)]
wires.sort()
dp = [1] * n
for i in range(n):
    for j in range(i):
        if wires[i][1] > wires[j][1]:
            dp[i] = max(dp[i], dp[j] + 1)

print(n - max(dp))