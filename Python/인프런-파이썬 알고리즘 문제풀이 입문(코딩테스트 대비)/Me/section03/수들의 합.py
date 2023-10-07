N, M = map(int, input().split())
A = list(map(int, input().split()))

arr = []
for i in range(N):
    for j in range(i, N + 1):
        arr.append(sum(A[i:j]))

print(arr.count(M))