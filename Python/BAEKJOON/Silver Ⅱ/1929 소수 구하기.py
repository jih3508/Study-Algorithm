def prime_number(num):
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

M, N = map(int, input().split())  
M = 2 if M < 2 else M
for i in range(M, N+1):
    if prime_number(i):  print(i)