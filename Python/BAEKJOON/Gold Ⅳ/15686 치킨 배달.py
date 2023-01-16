import sys
from itertools import combinations

N, M = map(int, input().split())
fields = [list(map(int, input().split())) for _ in range(N)]
houses = []
chicken_houses = []

for i in range(N):
    for j in range(N):
        if fields[i][j] == 1:
            houses.append((i, j))
        if fields[i][j] == 2:
            chicken_houses.append((i, j))

distance = N * 2 * len(houses)
for chicken_house in combinations(chicken_houses, M):
    distances = [N * 2] * len(houses)
    for i in range(len(houses)):
        x1, y1 = houses[i]
        for x2, y2 in chicken_house:
            distances[i] = min(abs(x1 - x2) + abs(y1 - y2), distances[i])
    distance = min(distance, sum(distances))

print(distance)