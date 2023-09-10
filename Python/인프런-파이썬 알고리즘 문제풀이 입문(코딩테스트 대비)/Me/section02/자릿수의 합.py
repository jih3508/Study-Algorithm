def digit_sum(x):
    return eval('+'.join(str(x)))

N = int(input())
arr = list(map(int, input().split()))
result = []
for num in arr:
    result.append(digit_sum(num))

max_result = max(result)
for i in range(N):
    if result[i] == max_result:
        print(arr[i])
        break