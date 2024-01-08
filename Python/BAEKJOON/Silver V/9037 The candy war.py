# 사탕 짝수개 맞추기
def checkCandy(candies):
    for i in range(len(candies)):
        candies[i] = candies[i] + 1 if candies[i] % 2 == 1 else candies[i]
    return candies

# 모든 사탕 같은지 확인 하는 메소드
def isSameCandy(candies):
    for candy in candies:
        if candy != candies[0]:
            return False
    return True

# 사탕 순화
def roundCandy(candies):
    length = len(candies)
    newCandies = [0 for _ in range(length)]
    for i in range(length):
        newCandies[i] = candies[i] // 2 + candies[(i - 1) % length] // 2
    return newCandies

for _ in range(int(input())):
    N = int(input())
    C = list(map(int, input().split()))
    count = 0
    while True:
        C = checkCandy(C)
        if isSameCandy(C):
            break
        C = roundCandy(C)
        count += 1
    print(count)