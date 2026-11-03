import sys

intput = sys.stdin.readline

n = int(intput())
# 큰 동전부터 가져가야 같은 합을 가장 적은 개수로 만들 수 있다
a = sorted(list(map(int, input().split())), reverse=True)

coin_sum = sum(a)
temp, count = 0, 0

for coin in a:
    temp += coin
    count += 1
    # 내 합 > 남은 합(sum - temp)을 정리한 식, 동률은 실패라 >를 쓴다
    if temp * 2 > coin_sum:
        break

print(count)
