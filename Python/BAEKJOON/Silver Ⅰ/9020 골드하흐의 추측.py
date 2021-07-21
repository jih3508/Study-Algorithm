import sys
input = sys.stdin.readline

prime_number = [1] * 10000
for num in range(2, 10000):
    for i in range(num * 2, 10000, num):
        prime_number[i] = 0

for _ in range(int(input())):
    n = int(input())
    for i in range(2, n // 2 + 1):
        j = n - i
        if prime_number[i] and prime_number[j]:
            num1, num2 = i, j
    print(num1, num2)