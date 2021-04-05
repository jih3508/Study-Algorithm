N, M =map(int, input().split())
arr = list(map(int, input().split()))
maximum = 0
flag = 0
for i in range(2, N):
    for j in range(1, i):
        for k in range(j):
            if maximum < arr[i] + arr[j] + arr[k] < M:
                maximum = arr[i] + arr[j] + arr[k]
            elif arr[i] + arr[j] + arr[k] == M:
                maximum = M
                flag = 1 
                break
        if flag: break
    if flag: break
print(maximum)