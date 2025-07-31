import sys
input = sys.stdin.readline

# 유클리드 호제법을 사용한 최대공약수 계산
def GCD(x, y):
    while x % y != 0:
        x, y = y, x % y

    return y

N = int(input())

positions = [int(input()) for _ in range(N)]
size = N - 1

# 연속된 가로수들 사이의 거리 계산
gaps = [abs(positions[i + 1] - positions[i]) for i in range(size)]

# 모든 간격의 최대공약수 계산
gcd = gaps[0]
total_distance = gaps[0]

for i in range(1, size):
    gcd = GCD(gcd, gaps[i])
    total_distance += gaps[i]

# 필요한 가로수 개수 = (총 거리 / 최소 간격) - 기존 간격 개수
print(total_distance // gcd - size)
