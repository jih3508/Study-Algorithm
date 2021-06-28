M = int(input())
N = int(input())
array = []
prime_number = []
M = M if M > 1 else 2

for number in range(2, M):
    flag = 1
    for k in prime_number:
        if number % k == 0:
            flag = 0
            break
    if flag:
        prime_number.append(number)
        
for number in range(M, N+1):
    flag = 1
    for k in prime_number:
        if number % k == 0:
            flag = 0
            break
    if flag:
        array.append(number)
        prime_number.append(number)

if array:
    print(sum(array))
    print(array[0])
else: print(-1)