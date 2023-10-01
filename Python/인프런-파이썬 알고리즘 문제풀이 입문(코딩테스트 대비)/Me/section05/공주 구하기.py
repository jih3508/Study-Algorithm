import sys
from collections import deque
sys.stdin=open("./Me/section05/input.txt", "r")

N, K = map(int, input().split())

queue = deque(list(range(1, N + 1)))
count = 0
while len(queue) > 1:
    prince = queue.popleft()
    count += 1
    if count == K:
        count = 0
        continue
    else:
        queue.append(prince)
    #print(queue, count)
    
print(queue.pop())