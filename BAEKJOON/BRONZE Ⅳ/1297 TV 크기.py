from math import sqrt
n, w, h = map(int, input().split())
rate = sqrt(n ** 2 /(w ** 2 + h ** 2))
w = int(rate * w)
h = int(rate * h)
print(w, h)