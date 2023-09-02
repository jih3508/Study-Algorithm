N = int(input())
cnt = [0] * (N + 1)
for i in range(2, N + 1):
    for k in range(i , N + 1, i):
        cnt[k] += 1

print(cnt.count(1))

