import sys
import math

input = sys.stdin.readline

def is_prime(n: int) -> bool:
    """n이 소수인지 판별한다. 2부터 sqrt(n)까지 나누어 떨어지는 수가 없으면 소수."""
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def next_prime(n: int) -> int:
    """n 이상의 소수 중 가장 작은 소수를 반환한다."""
    # 0, 1은 소수가 아니므로 가장 작은 소수인 2 반환
    if n <= 1:
        return 2

    while True:
        if is_prime(n):
            return n
        n += 1

# 테스트 케이스 수 입력
T = int(input())

result = []
for _ in range(T):
    N = int(input())
    result.append(next_prime(N))

# 출력은 마지막에 한 번만 (print 반복 호출 대신 성능 개선)
print("\n".join(map(str, result)))