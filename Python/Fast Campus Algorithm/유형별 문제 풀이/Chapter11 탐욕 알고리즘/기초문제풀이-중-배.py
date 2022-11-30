'''
- 모든 박스를 배로 옮기는데 드는 시간의 최솟값을 계산해야 한다.
- 매 분마다, 모든 크레인에 대하여 옮길 수 있는 박스를 선택하여 옮기도록 한다.
- 박스를 무게 기준으로 내림차순 정렬한 뒤에, 무거운 것부터 옮기도록 하면 된다.
- 시간 복잡도 O(NM)에 문제를 해결할 수 있다.
- 매 분마다, 모든 크레인에 대하여 옮길 수 있는 박스를 선택하여 옮기도록 한다.
'''
import sys

n = int(input())
cranes = list(map(int, input().split()))

m = int(input())
boxs = list(map(int, input().split()))

if max(cranes) < max(boxs):
    print(-1)
    sys.exit()

# 각 크레인이 현재 옮겨야 하는 박스의 번호(0부터 시작)
positions = [0] * n
# 각 박스를 옮겼는지의 여부
checked = [False] * m
# 최적의 해를 구해야 하므로 내침차순 정렬
cranes.sort(reverse=True)
boxs.sort(reverse=True)
result = 0
count = 0

while True:
    if count == len(boxs):  # 박스를 다 옮겼다면 종료
        break
    for i in range(n): # 모든 크레인에 대하여 각각 처리
        while positions[i] < len(boxs):
            # 아직 안 옮긴 박스 중에서 옮길 수 있는 박스를 만날 때까지 반복
            if not checked[positions[i]] and cranes[i] >= boxs[positions[i]]:
                checked[positions[i]] = True
                positions[i] += 1
                count += 1
                break
            positions[i] += 1
    result += 1
print(result)