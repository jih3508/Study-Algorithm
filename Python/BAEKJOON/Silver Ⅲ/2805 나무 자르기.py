n, m = map(int, input().split())
trees = list(map(int, input().split()))
min_value = 1
max_value = max(trees)
while min_value <= max_value:
    mid = (min_value + max_value) // 2
    lenth = sum([tree- mid for tree in trees if tree > mid])
    if m > lenth: 
        max_value = mid - 1
    else:
        min_value = mid + 1
print(max_value)