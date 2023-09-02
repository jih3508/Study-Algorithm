def reverse(x):
    return int(str(x)[::-1])

def isPrime(x):
    flag = True
    if x == 1: return False
    for num in range(2, x):
        if x % num == 0:
            flag = False
            break
    return flag

N = int(input())
arr = list(map(int, input().split()))

result = []
for num in arr:
    tmp = reverse(num)
    if isPrime(tmp):
        result.append(tmp)

print(' '.join(map(str, result)))
