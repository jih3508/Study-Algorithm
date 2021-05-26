n, c = map(int, input().split())
array = [int(input()) for _ in range(n)]
array.sort()
gap = [array[i+1] - array[i] for i in range(n-1)]
start = min(gap)
end = array[-1] - array[0]

while start <= end:
    mid = (start + end) // 2
    value = array[0]
    count = 1
    for num in array[1:]:
        if num - value >= mid:
            count += 1
            value = num
    if count < c: end = mid - 1
    else: start = mid + 1
print(end)