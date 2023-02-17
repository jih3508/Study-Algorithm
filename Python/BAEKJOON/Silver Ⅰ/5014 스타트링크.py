from collections import deque

def bfs():
    queue = deque([S])
    elevator[S] = 0
    while queue:
        floor = queue.popleft()
        if floor == G: 
            print(elevator[G])
            return
        for next_floor in(floor + U , floor - D):
            if 0 < next_floor <= F and elevator[next_floor] == -1:
                elevator[next_floor] = elevator[floor] + 1
                queue.append(next_floor)
    print('use the stairs')

F, S, G, U, D = map(int, input().split())
elevator = [-1] * (F + 1)
bfs()