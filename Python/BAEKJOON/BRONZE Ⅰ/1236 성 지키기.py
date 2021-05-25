n, m = map(int, input().split())
array = [input() for _ in range(n)]
rows, cols = [1] * n , [1] * m

for i in range(n):
    for j in range(m):
        if array[i][j] == 'X':
            rows[i] = 0
            cols[j] = 0

print(max(sum(rows), sum(cols)))