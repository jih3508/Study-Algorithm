import sys
input = sys.stdin.readline

for _ in range(int(input())):
    array = list(map(int, input().split()))
    n = array.pop(0)
    avg = sum(array) / n
    count = 0
    for i in array:
        if i > avg: count += 1
    print("%.3f%%"%round(count * 100/ n, 3))