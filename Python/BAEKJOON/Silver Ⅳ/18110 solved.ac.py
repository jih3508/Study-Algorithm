import sys
input = sys.stdin.readline

N = int(input())

if N:
    trimmedNum = int(N * 0.15 + 0.5) # 절사 평균 기준 값
    array = sorted([int(input()) for _ in range(N)])
    print(int(sum(array[trimmedNum: N - trimmedNum]) / (N - trimmedNum * 2) + 0.5))
else:
    print(0)