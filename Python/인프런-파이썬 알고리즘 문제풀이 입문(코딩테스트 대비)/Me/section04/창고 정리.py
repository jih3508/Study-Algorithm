import sys
sys.stdin=open("./Me/section04/input.txt", "r")

L = int(input())
towers = list(map(int, input().split()))
for _ in range(int(input())):
    towers.sort()
    towers[0] += 1
    towers[-1] -= 1
    #print(towers)

towers.sort()
print(towers[-1] - towers[0])