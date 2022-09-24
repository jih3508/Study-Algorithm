import sys
input = sys.stdin.readline

N, M = map(int, input().split())

real_people = set(map(int, input().split()[1:]))

count = 0
parties = []

for _ in range(M):
    party = set(map(int, input().split()[1:]))
    if party & real_people:
        real_people = real_people.union(party)
    parties.append(party)

for _ in range(len(parties)):
    for party in parties:
        if party & real_people:
            real_people = real_people.union(party)

for party in parties:
    count += 0 if party & real_people else 1

print(count)