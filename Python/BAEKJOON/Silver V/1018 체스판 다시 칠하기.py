n , m = map(int, input().split())
data = []
for i in range(n):
    data.append(list(input()))
count = n * m
for i in range(n-7):
    for j in range(m -7):
        B = 0
        W = 0
        for x in range(0,8):
            for y in range(0,8,2):
                if x%2 == 0:
                    B += data[i+x][j+y] == 'W'
                    B += data[i+x][j+y+1] == 'B' 
                    W += data[i+x][j+y] == 'B'
                    W += data[i+x][j+y+1] == 'W'
                else:
                    B += data[i+x][j+y] == 'B'
                    B += data[i+x][j+y+1] == 'W' 
                    W += data[i+x][j+y] == 'W'
                    W += data[i+x][j+y+1] == 'B'
        count = min(count, B, W)
print(count)