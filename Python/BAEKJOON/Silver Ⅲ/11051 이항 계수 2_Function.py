from math import factorial

N, K =  map(int, input().split())
print(factorial(N) // (factorial(N-K) * factorial(K)) % 10007)