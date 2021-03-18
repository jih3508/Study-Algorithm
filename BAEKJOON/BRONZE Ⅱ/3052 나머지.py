s = []
for _ in range(10):
    s.append(int(input()))
s = set(map(lambda x: x%42,s))
print(len(s))