import sys
    
input = sys.stdin.readline

n, m = map(int, input().split())
array = list(map(int, input().split()))
s = [0]
for k in range(n):
    s.append(s[-1] + array[k])

for _ in range(m):
    i, j = map(int, input().split())
    print(s[j] - s[i - 1] )