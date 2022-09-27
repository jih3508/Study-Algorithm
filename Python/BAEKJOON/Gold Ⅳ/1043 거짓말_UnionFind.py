import sys
input = sys.stdin.readline

def union(x, y):
    x = find(x)
    y = find(y)
    if x < y:
        parents[y] = x
    else:
        parents[x] = y

def find(x):
    if x == parents[x]:
        return x
    return find(parents[x])

n, m = map(int, input().split())
parents = [i for i in range(n+1)]

for i in list(map(int, input().split()[1::])):
    parents[i] = 0

parties = []
for _ in range(m):
    people = list(map(int, input().split()[1:]))
    parties.append(people)
    if len(people) > 1:
        for i in range(1, len(people)):
            union(people[i-1], people[i])

count = 0
for party in parties:
    for person in party:
        if find(parents[person]) == 0:
            break
    else:
        count += 1

print(count)