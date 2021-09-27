import sys

input = sys.stdin.readline

def pibo(k):
    if k == 0:
        return [1, 0]
    if k == 1:
        return [0, 1]
    if k not in memo.keys():
        k1 = pibo(k - 1)
        k2 = pibo(k - 2)
        memo[k] = [k1[0] + k2[0], k1[1] + k2[1]]
    return memo[k]

n = int(input())
memo = {0 : [1, 0], 1: [0, 1]}
for _ in range(n):
    num = int(input())
    print(' '.join(map(str, pibo(num))))