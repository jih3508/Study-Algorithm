from itertools import combinations

N, M = map(int, input().split())
arr = list(map(int, input().split()))
maximum = 0
for data in combinations(arr, 3):
    if maximum< sum(data)<=M:
        maximum = sum(data)
        if maximum == M: break
print(maximum)