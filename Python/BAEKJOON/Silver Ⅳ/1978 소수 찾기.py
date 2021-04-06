prime_number = [2]
for i in range(3, 1001):
    flag = 1
    for number in prime_number:
        if i % number == 0:
            flag = 0
            break
    if flag: prime_number.append(i)

n = int(input())
arr = list(map(int, input().split()))
cnt = 0
for number in arr:
    cnt += number in prime_number
print(cnt)