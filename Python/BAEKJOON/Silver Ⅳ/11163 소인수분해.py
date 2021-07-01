n = int(input())
i = 2
array = []
while n != 1:
    if n % i == 0: 
        array.append(i)
        n //= i
    else: i += 1
print('\n'.join(map(str, array)))