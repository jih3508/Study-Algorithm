def factorial(n):
    result = 1
    while(n > 1):
        result = result * n % P
        n -= 1
    return result

# base: 밑, expo: 지수
def FIT(base, expo):
    if expo == 1: return base % P
    
    result = FIT(base, expo //2)
    result = result * result % P
    if(expo % 2 == 1): return result * base % P
    else: return result
    

P = 1000000007
N, K = map(int, input().split())
print(factorial(N) * FIT(factorial(N - K) * factorial(K) % P, P - 2) % P)