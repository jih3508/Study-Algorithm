from collections import deque
queue = deque()
N, M = map(int, input().split())
queue = deque(list(range(1, N + 1)))

count = 0
for num in list(map(int, input().split())):
    flag = queue.index(num) >= len(queue) / 2
    while num != queue[0]:
        if flag:
            queue.extendleft([queue.pop()])
        else:
            queue.append(queue.popleft())
        count += 1
    queue.popleft()
    
print(count)