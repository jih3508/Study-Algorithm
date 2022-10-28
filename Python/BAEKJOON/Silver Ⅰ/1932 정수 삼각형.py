n = int(input())
triangle = [list(map(int, input().split())) for _ in range(n)]

for i in range(1, n):
    triangle[i-1].append(0)
    triangle[i-1].insert(0, 0)
    for j in range(i+1):
        triangle[i][j] += max(triangle[i-1][j], triangle[i-1][j+1])

print(max(triangle[-1]))