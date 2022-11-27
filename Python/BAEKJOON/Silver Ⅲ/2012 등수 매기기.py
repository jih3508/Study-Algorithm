import sys
input = sys.stdin.readline
ranks = sorted([int(input()) for _ in range(int(input()))])
count = 0
for index, ranks in enumerate(ranks):
    count += abs(ranks - index - 1)    
print(count)