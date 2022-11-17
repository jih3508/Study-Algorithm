from collections import deque
import sys
input = sys.stdin.readline
queue = deque()
N = int(input())
while(1):
    value = int(input())
    if(value == -1): break
    if value:
        if len(queue) < N:
            queue.append(value)
    else:
        queue.popleft()

if queue:
    print(' '.join(map(str, queue)))
else:
    print("empty")