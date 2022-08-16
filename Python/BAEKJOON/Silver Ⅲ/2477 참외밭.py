K = int(input())
max_width, max_height = (0, 0), (0, 0)
total = []

for i in range(6):
    d, length = map(int, input().split())
    if(d == 1 or d == 2):
        if length > max_height[1]:
            max_height = (i, length)
    if(d == 3 or d == 4):
        if length > max_width[1]:
            max_width = (i, length)
    total.append(length)

check = [(max_height[0] + 1) % 6, (max_height[0] - 1) % 6, (max_width[0] + 1) % 6, (max_width[0] - 1) % 6]

S = 1
for i in range(6):
    if i not in check:
        S *= total[i]
print(((max_width[1] * max_height[1]) - S) * K)