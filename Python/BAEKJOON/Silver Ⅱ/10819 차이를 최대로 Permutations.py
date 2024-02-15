from itertools import permutations

N = int(input())
array = list(map(int, input().split()))
max_num = 0

for arr in permutations(array):
    max_num = max(max_num, sum([abs(arr[i] - arr[i + 1]) for i in range(N - 1)]))

print(max_num)
