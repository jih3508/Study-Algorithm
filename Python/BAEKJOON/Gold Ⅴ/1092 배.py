N = int(input())
cranes = sorted(list(map(int, input().split())), reverse= True)

M = int(input())
boxs = sorted(list(map(int, input().split())), reverse= True)

if cranes[0] < boxs[0]: 
    print(-1)
    exit()

position = [0] * N # 각 크레인이 현재 옮겨야 하는 박스의 번호(0부터 시작)
checked = [False] * M # 박스 옮겨는지 체크
result = 0

while True:
    if sum(checked) == M: break
    # 이번 타임에 각 크레인 실을수 있는 박스 조사 
    for i in range(N):
        while position[i] < M:
            # 남은 박스중 옮길수 있는 박스 선택
            if not checked[position[i]] and cranes[i] >= boxs[position[i]]:
                checked[position[i]] = True
                position[i] += 1
                break
            position[i] += 1
    result += 1

print(result)