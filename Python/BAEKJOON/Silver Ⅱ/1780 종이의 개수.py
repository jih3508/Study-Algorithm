import sys

def cutting(x, y, k):
    if k == 1:
        for i in range(x, x+k):
            for j in range(y, y+k):
                count[matrix[x][y]] += 1
        return
    start = matrix[x][y]
    flag = True
    for i in range(x, x+k):
        for j in range(y, y+k):
            if matrix[i][j] != start:
                flag = False
                break
        if flag == False: break
    if flag:
        count[start] += 1
    else:
        value = k // 3
        for i in range(3):
            for j in range(3):
                cutting(x + i * value, y + j * value, value)
        

input = sys.stdin.readline

count = {-1: 0, 0: 0, 1: 0}

matrix = []
n = int(input())
for _ in range(n):
    matrix.append(list(map(int, input().split())))
    
cutting(0, 0, n)
for num in count.keys(): print(count[num])