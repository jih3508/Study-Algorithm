from itertools import combinations

N, S = map(int, input().split())
array = list(map(int, input().split()))
count = 0

for i in range(1, N + 1):
    for arr in combinations(array, i):
        count += sum(arr) == S

print(count)