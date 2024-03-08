# Ch03
## 조건문과 반복문
1. 논리 연산자/ 비트 연산자 활용하기
```python
a, b = 10, 20

if a > b and a % 10 == 0:
    print(a)

# and or not

1 << 2, 1 & 1
1 | 1
1 ^ 1
```
2. 상태를 나타내는 자료 활용하기
```python
N = 71
ck = False

for i in range(2, N):
    if N % i == 0:
        print("Not Prime")
        ck = True
        break

if not ck:
    print("Prime")
```

3. 나눠서 진행하기
```python
def isPrime(N):
    for i in range(2, N):
        if N % i == 0:
            return False
    return True

for N in range(10, 100):
    if isPrime(N):
        print("{} if Prime".format(N))
    else:
        print("Not Prime")

def isRange(a, b, N, M):
    return 0 <= a < N and 0 <= b < M
```

4. 여러 자료구조와 메서드, 함수 활용하기
```python

S = "hello"

if S == S[::-1]:
    print("isPalin")
```

5. 미리 처리한 케이스와 처리할 케이스 정리하기
```python
# 1. 예제 케이스
# 2. 조건 A처리
# 3. 조건 B처리
# 4. 조건 AB처리
```
6. 예제, 최소, 최대, 예외, 랜덤 케이스 만들기
