from collections import Counter

result = []
for _ in range(int(input())):
    arr = list(map(int, input().split()))
    count = Counter(arr)
    max_count = max(count.values())
    max_value = 0
    for num in sorted(count.keys()):
        if max_count == count[num]:
            max_value = num
    if max_count == 3:
        result.append(10000 + max_value * 1000)
    elif max_count == 2:
        result.append(1000 + max_value * 100)
    else:
        result.append(max_value * 100)
    
print(max(result))