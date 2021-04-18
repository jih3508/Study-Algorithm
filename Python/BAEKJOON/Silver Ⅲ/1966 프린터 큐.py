n = int(input())

for _ in range(n):
    N, M = map(int, input().split())
    arr = list(map(int, input().split()))
    count = 0
    while arr:
        if arr[0] == max(arr):
            count +=1
            arr.pop(0)
            if M == 0: break
            M = (len(arr) + M - 1) % len(arr)         
        else:
            arr.append(arr.pop(0))
            M = (len(arr) + M - 1) % len(arr)
    print(count)