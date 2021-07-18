import sys
input = sys.stdin.readline

array = [1 for _ in range(123456*2 + 1)]
array[1] = 0

for i in range(2, 123456):
    for j in range(i * 2, 123456*2, i):
        array[j] = 0

while True:
    n = int(input())
    if n == 0: break
    count = sum(array[n + 1: n *2 ])
    print(count if count else 1)