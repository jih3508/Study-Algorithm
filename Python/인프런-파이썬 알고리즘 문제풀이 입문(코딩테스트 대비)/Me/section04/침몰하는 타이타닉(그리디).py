import sys
from collections import deque
sys.stdin=open("./Me/section04/input.txt", "r")

N, M = map(int, input().split())
arr = deque(sorted(list(map(int, input().split()))))
count = 0

while arr:
    if len(arr) == 1:
        count += 1
        break
    
    if arr[0] + arr[-1] > M:
        arr.pop()
        count += 1
    else:
        arr.pop()
        arr.popleft()
        count += 1

print(count)