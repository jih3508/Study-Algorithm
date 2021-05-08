def find(x):
    if x == parent[x]:
        return x
    else:
        p = find(parent[x])
        parent[x] = p
        return parent[x]

def union(x, y):
    x = find(x)
    y = find(y)
    if x != y:
        parent[y] = x
        number[x] += number[y]

test_case = int(input())
for _ in range(test_case):
    F = int(input())
    parent = dict()
    number = dict()
    for _ in range(F):
        a, b = input().split()
        if a not in parent.keys():
            parent[a] = a
            number[a] = 1
        if b not in parent.keys():
            parent[b] = b
            number[b] = 1
        union(a, b)
        print(number[find(a)])