group = {} # 아이돌 group
idol = {} # 아이돌 소속

N, M = map(int, input().split())

# 아이돌 그룹 세팅
for _ in range(N):
    groupName = input()
    group[groupName] = [] # 아이돌 그룹 초기화
    for _ in range(int(input())):
        idolName = input()
        group[groupName].append(idolName)
        idol[idolName] = groupName
    group[groupName] = sorted(group[groupName]) # 그룹 멤버 이름 정렬

for _ in range(M):
    keyword = input()
    # 1 일때 소속 그룹 출력 나머지는 그룹 맴버 출력
    if int(input()):
        print(idol[keyword])
    else:
        print('\n'.join(group[keyword]))