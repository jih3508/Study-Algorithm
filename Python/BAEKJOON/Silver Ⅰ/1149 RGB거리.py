import sys

input = sys.stdin.readline

size = int(input())

houses = [list(map(int, input().split())) for _ in range(size)]

for i in range(1, size):
    houses[i][0] += min(houses[i-1][1], houses[i-1][2])
    houses[i][1] += min(houses[i-1][0], houses[i-1][2])
    houses[i][2] += min(houses[i-1][0], houses[i-1][1])
    
print(min(houses[-1]))