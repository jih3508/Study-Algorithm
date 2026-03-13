import sys
input = sys.stdin.readline

for _ in range(int(input())):
    N = int(input())

    result = 0
    for num in range(1, int(N ** 0.5) + 1):
        if N % num == 0:
            result += 2 if num != N / num else 1

    print("{} {}".format(N, result))