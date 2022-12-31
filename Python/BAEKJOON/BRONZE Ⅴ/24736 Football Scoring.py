jumsu = [6, 3, 2, 1, 2]
gradles = [0, 0]
for i in range(2):
    fileds = list(map(int, input().split()))
    for j in range(5):
        gradles[i] += fileds[j] * jumsu[j]

print(' '.join(map(str, gradles)))