from collections import deque
import sys

A, B = map(int, input().split())
queue = deque([(A, 1)])

while queue:
    num, move = queue.popleft()
    if num == B:
        print(move)
        sys.exit()

    for fnum in (num * 2, num * 10 + 1):
        if num <= B:
            queue.append((fnum, move + 1))        

print(-1)