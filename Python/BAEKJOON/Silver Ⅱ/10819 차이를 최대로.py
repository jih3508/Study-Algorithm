def combination(k = 0):
    global max_num
    if(k == N):
        max_num = max(sum([abs(array[i] - array[i + 1]) for i in range(N - 1)]), max_num)
        return
    else:
        for i in range(k, N):
            array[k], array[i] = array[i], array[k]
            combination(k + 1)
            array[k], array[i] = array[i], array[k]

N = int(input())
array = list(map(int, input().split()))
max_num = 0

combination()

print(max_num)