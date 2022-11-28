N = int(input())
K = int(input())

start = 0
end = N * N
while start <= end:
    mid = (start + end) //2
    count = 0
    for i in range(1, N + 1):
        count += min(mid // i, N)
    if count >= K :
        end = mid - 1
    else:
        start = mid + 1

print(start)