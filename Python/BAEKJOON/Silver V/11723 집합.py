import sys
input = sys.stdin.readline

S = set({})
for _ in range(int(input())):
    data = input().split()
    if data[0] == 'add': S.add(int(data[1]))
    elif data[0] == 'remove':
        if int(data[1]) in S: S.remove(int(data[1]))
    elif data[0] == 'check': print(1 if int(data[1]) in S else 0)
    elif data[0] == 'toggle':
        if int(data[1]) in S: S.remove(int(data[1]))
        else: S.add(int(data[1]))
    elif data[0] == 'all': S = set([i for i in range(1, 21)])
    elif data[0] == 'empty': S.clear()