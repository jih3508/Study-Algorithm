import sys
from collections import Counter

n = int(sys.stdin.readline())
arr = [int(sys.stdin.readline()) for _ in range(n)]
arr.sort()
count_arr = Counter(arr)
max_count_arr = max(count_arr.values())
count_arr = sorted([i for i in count_arr if count_arr[i] == max_count_arr])
print(round(sum(arr)/n))
print(arr[n//2])
print(count_arr[1] if len(count_arr) > 1 else count_arr[0])
print(arr[-1] - arr[0])