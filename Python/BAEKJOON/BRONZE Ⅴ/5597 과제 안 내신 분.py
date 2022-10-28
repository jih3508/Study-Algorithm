array = [False] * 31
for _ in range(28): array[int(input())] = True
for i in range(1, 31):
    if(not array[i]): print(i)