N = int(input())
result = [" " * (N - i - 1) + "*" * (i * 2 + 1) for i in range(N)]
print("\n".join(result))
result = [" " * (N - i - 1) + "*" * (i * 2 + 1) for i in range(N - 2, -1, -1)]
print("\n".join(result))