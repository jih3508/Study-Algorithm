import sys

case = int(sys.stdin.readline())
for _ in range(case):
    k = int(sys.stdin.readline())
    n = int(sys.stdin.readline())
    buliding = [list(range(1, n+1))]
    for i in range(k):
        line = [1]
        for j in range(1,n):
            line.append(buliding[i][j] + sum(buliding[i][:j]))
        buliding.append(line)
    print(buliding[-1][-1])