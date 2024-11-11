import sys
from collections import deque
input = sys.stdin.readline

for _ in range(int(input())):
    N = int(input())
    alphas = list(input().split())
    d = deque(alphas[0])
    for alpha in alphas[1:]:
        # 문자 크기 비교
        # Character에서 덧쌤 뺄샘 할때 ASCII 코드 값으로 변환 해서 계산
        # 두 문자 뺄쌤해서 0이하이면 크기가 작으므로 앞에 붙인다.
        if(ord(alpha) - ord(d[0]) <= 0):
            d.appendleft(alpha)
        else:
            d.append(alpha)
    print(''.join(d))