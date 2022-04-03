import sys
input = sys.stdin.readline

n, k = map(int, input().split())
money = [int(input()) for _ in range(n)]
count = 0

for m in money[::-1]:
    count += k // m
    k = k % m

print(count)