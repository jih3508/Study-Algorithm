def factorial(n):
    if n == 0: return 1
    return factorial(n-1) * n

N, K = map(int , input().split())
print(factorial(N)//(factorial(K)*factorial(N-K)))