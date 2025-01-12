N = int(input())
S = list(map(int, input().split()))
result = 0
end = 1

for start in range(N-1):
    while end < N:
        if(len(set(S[start:end + 1])) > 2):
            result = max(result, end - start)
            break
        end += 1

    print(start, end)
    if(N == end):
        result = max(result, end - start)
        break

print(result)