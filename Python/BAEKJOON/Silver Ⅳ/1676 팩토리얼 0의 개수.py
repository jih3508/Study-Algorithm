n = int(input())

factorial = [1]
for i in range(1, 501): factorial.append(factorial[i-1] * i)

print(len(str(factorial[n])) - len(str(factorial[n]).rstrip('0')))