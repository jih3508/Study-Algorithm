N = int(input())
arr = list(map(int, input().split()))
for i in range(1, N):
    if arr[i]:
        arr[i] += arr[i-1]

print(arr)
print(sum(arr))