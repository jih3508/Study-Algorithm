import sys
input = sys.stdin.readline

for _ in range(int(input())):
    N = int(input())
    gradles = []
    for _ in range(N):
        gradles.append(list(map(int, input().split())))

    gradles.sort()
    top = gradles[0][1]
    count = 1
    for gradle in gradles[1:]:
        if gradle[1] < top:
            count += 1
            top = gradle[1]
    print(count)