size = 101
arrays = [[0] * size for _ in range(size)]
for _ in range(int(input())):
    x, y = map(int, input().split())
    for i in range(10):
        for j in range(10):
            arrays[x + i][y + j] = 1

count = 0
for array in arrays:
    count += array.count(1)

print(count)