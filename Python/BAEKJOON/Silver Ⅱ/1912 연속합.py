n = int(input())
array = list(map(int, input().split()))

for i in range(1, n):
    array[i] = max(array[i], array[i] + array[i-1])
print(max(array))