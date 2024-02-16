def combination(k = 0, value = 0):
    global count
    if(k > 0 and value == S):
        count += 1
    if(k == N):
        return
    else:
        for i in range(k, N):
            combination(i + 1, value + array[i])

N, S = map(int, input().split())
array = list(map(int, input().split()))
count = 0

combination()

print(count)