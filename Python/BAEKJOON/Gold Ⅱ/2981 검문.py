import sys
import math

input = sys.stdin.readline

array = sorted([int(input()) for _ in range(int(input()))])
gcd = 0
for i in range(1, len(array)):
    gcd = math.gcd(array[i] - array[i-1], gcd)

result = set()

for num in range(1, int(math.sqrt(gcd)) + 1):
    if gcd % num == 0:
        result.add(num)
        result.add(gcd // num)

result.remove(1)
result = sorted(list(result))
print(' '.join(map(str, result)))