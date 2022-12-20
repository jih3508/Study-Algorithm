from collections import deque

N, K = map(int, input().split())
location = [-1] * 100001
location[N] = 0
queue = deque([N])
while queue:
    now = queue.popleft()
    if now == K: break
    
    # (X - 1, X + 1) 이동할 경우
    for fx in (now - 1, now + 1):
        if 0<= fx <= 100000 and (location[fx] == -1 or location[now] < location[fx]):
            location[fx] = location[now] + 1
            queue.append(fx)        
    
    # X * 2로 순간 이동할 경우
    fx = now * 2
    if 0< fx <= 100000 and (location[fx] == -1 or location[now] < location[fx]):
        location[fx] = location[now]
        queue.append(fx)    
        
print(location[K])