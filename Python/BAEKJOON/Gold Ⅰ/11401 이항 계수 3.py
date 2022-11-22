def factorial(n):
    result = 1
    while(n > 1):
        result = result * n % P
        n -= 1
    return result
    
P = 1000000007
N, K = map(int, input().split())
print(factorial(N) * pow(factorial(N - K) * factorial(K) % P, P - 2, P) % P)