N, M = map(int, input().split())
cnt = {i : 0 for i in range(1, N + M + 1)} 
for i in range(1, N + 1):
    for j in range(1, M + 1):
        cnt[i + j] += 1

max_cnt = max(cnt.values())
result = []
for num in cnt.keys():
    if cnt[num] == max_cnt:
        result.append(num)

result.sort()
print(' '.join(map(str, result)))
