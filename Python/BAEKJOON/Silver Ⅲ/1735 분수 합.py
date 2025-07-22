"""
* 유클리드 호제법을 이용한 최대공약수(GCD) 계산
 * @param x 첫 번째 수
 * @param y 두 번째 수
 * @return x와 y의 최대공약수
"""

def GCD(x, y):
    while(x % y != 0 and x != 0):
        r = x % y
        x, y = y, r
    return y

a1, b1 = map(int, input().split())
a2, b2 = map(int, input().split())

a3 = a1 * b2 + a2 * b1 # 합의 분자
b3 = b1 * b2           # 합의 분모

gcd = GCD(a3, b3) # 기약분수로 만들기 위해 최대공약수(GCD) 구하기

# 분자와 분모를 최대공약수로 나누어 기약분수 출력
print(f"{a3 // gcd} {b3 // gcd}")
