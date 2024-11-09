import math

N = int(input())
print(math.ceil(round(math.log(N, 2), 10)) + 1 if N > 0 else 0)