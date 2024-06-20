import sys

input = sys.stdin.readline

N, M = map(int, input().split())
basket = [0] * N # 바구니

for _ in range(M):
    i, j, k = map(int, input().split())
    # i ~ j 번 바구니에 k번 번호 넣기
    for x in range(i - 1, j):
        basket[x] = k

print(' '.join(map(str, basket)))