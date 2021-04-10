n = int(input())
members = [input().split() + [i] for i in range(n)]
members.sort(key = lambda member : (int(member[0]), member[2]))
for member in members:
    print(member[0], member[1])