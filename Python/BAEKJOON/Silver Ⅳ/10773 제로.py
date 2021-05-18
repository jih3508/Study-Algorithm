import sys

K = int(sys.stdin.readline())
numbers = []
for _ in range(K):
    n = int(sys.stdin.readline())
    if n:
        numbers.append(n)
    else:
        numbers.pop()
print(sum(numbers))
