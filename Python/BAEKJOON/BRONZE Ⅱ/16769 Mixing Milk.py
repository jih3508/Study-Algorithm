cups = []
milks = []

for _ in range(3):
    cup, milk = map(int, input().split())
    cups.append(cup)
    milks.append(milk)

count = 0
while count < 100:
    # 현재 컵, 옯길 컵 위치 계산
    now, next = count % 3, (count + 1) % 3
    milks[next] += milks[now]

    # 컵에 우유가 꽉 찼을 때
    if milks[next] > cups[next]:
        milks[now] = milks[next] - cups[next]
        milks[next] = cups[next]
    else:
        milks[now] = 0

    count += 1

print('\n'.join(map(str, milks)))