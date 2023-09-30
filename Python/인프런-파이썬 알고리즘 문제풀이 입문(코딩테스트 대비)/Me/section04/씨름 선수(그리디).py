import sys
sys.stdin=open("./Me/section04/input.txt", "r")

N = int(input())
bodys = [list(map(int, input().split())) for _ in range(N)]
bodys.sort(reverse= True)

count = 1
standard_weight = bodys[0][1]
for key, weight in bodys[1:]:
    if standard_weight < weight:
        standard_weight = weight
        count += 1

print(count)