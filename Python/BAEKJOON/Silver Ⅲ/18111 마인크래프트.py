import sys

n, m, b = map(int, sys.stdin.readline().split())
array = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
max_value = max(map(max, array))
min_value = min(map(min, array))
now_count = 1e9

for i in range(min_value, max_value + 1):
    ground_count = 0
    count = b
    for arr in array:
        for j in arr:
            h = j - i
            count += h
            ground_count += -h if h < 0 else h * 2
    if count >= 0 and now_count >= ground_count:
        now_count = ground_count
        now_hight = i
        
print(now_count, now_hight)