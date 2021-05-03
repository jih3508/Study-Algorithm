import sys
from math import comb

case = int(sys.stdin.readline())
for _ in range(case):
    k = int(sys.stdin.readline())
    n = int(sys.stdin.readline())
    print(comb(k+n, n-1)) 