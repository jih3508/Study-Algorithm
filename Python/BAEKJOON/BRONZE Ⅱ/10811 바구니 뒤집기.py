import sys

input = sys.stdin.readline

N, M = map(int, input().split())
array = list(range(1, N + 1))

for _ in range(M):
    i, j = map(int, input().split())
    tmp = array[i - 1:j] # 역순할 리스트 임시로 저장
    array[i - 1: j] = tmp[::-1]

print(' '.join(map(str, array)))