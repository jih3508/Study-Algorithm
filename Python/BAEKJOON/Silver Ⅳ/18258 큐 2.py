from collections import deque
import sys
input = sys.stdin.readline
queue = deque()

for _ in range(int(input())):
    commend = input().split()
    if commend[0] == "push":
        queue.append(int(commend[1]))
    elif commend[0] == "pop":
        print(queue.popleft() if queue else - 1)
    elif commend[0] == "size":
        print(len(queue))
    elif commend[0] == "empty":
        print(0 if queue else 1)
    elif commend[0] == "front":
        print(queue[0] if queue else -1)
    elif commend[0] == "back":
        print(queue[-1] if queue else -1)