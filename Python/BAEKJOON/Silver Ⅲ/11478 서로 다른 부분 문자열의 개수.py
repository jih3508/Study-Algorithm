S = input()
s = set({})
size = len(S)

for i in range(1, size + 1):
    for j in range(size - i + 1):
        s.add(S[j: j + i])

print(len(s))