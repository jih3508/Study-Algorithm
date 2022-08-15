N, M = map(int, input().split())

A = set(list(map(int, input().split())))
B = set(list(map(int, input().split())))

c = set({})
for num in A:
    if num in B:
        B.remove(num)
        c.add(num)

for num in c:
    A.remove(num)

print(len(A) + len(B))