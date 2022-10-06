from itertools import permutations

N, M = map(int, input().split())

array = [i for i in range(1, N + 1)]
for item in permutations(array, M):
    print(' '. join(map(str, item)))