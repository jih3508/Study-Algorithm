N, L, K = map(int, input().split())
tests = [list(map(int, input().split())) for _ in range(N)]

# 문제 어려운 순으로 오름차순 정렬
tests = sorted(tests, key=lambda x: x[1])

result = 0 # 결과 값 변수

# 문제 풀때 마다 최대 문제 푸는 수를 차감한다.
for test in tests:
    # 최대 풀수 있는 문제가 초과 되면 반복문에서 빠져 나온다.
    if K == 0:
        break
    # 어려운 문제 풀수 있는 경우
    elif L >= test[1]:
        result += 140
        K -= 1
    elif L >=test[0]:
        result += 100
        K -= 1

print(result)