def summary(n):
    if n == 1:
        return 1
    return n + summary(n - 1)

print(summary(5))