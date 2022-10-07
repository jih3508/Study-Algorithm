from itertools import combinations

N, M = map(int, input().split())
array = list(range(1, N+1))
for item in combinations(array, M):
    print(' '.join(map(str, item)))