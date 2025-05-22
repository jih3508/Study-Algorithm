N, K = map(int, input().split())

divisors = []
for i in range(1, N + 1):
    if N % i == 0:
        divisors.append(i)

print(divisors[K - 1] if len(divisors) >= K else 0)