import sys

input = sys.stdin.readline

N, M = map(int, input().split())
basket = [i for i in range(1, N + 1)]

for _ in range(M):
    i, j = map(int, input().split())
    # i ~ j 번 바구니에 k번 번호 넣기
    basket[i - 1], basket[j - 1] = basket[j - 1], basket[i - 1];

print(' '.join(map(str, basket)))