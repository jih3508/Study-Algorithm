def divide_sum(n):
    for i in range(1, n+1):
        if sum(map(int, list(str(i)))) + i == n:
            return i
    return 0

n = int(input())
print(divide_sum(n))