# 현재 회사에 있는 사람들의 이름을 저장할 Set
names = set({})

for _ in range(int(input())):
    # 각 로그를 공백으로 분리하여 이름과 상태를 파싱
    name, action = input().split()

    #"enter"면 사람을 회사에 추가, "leave"면 회사에서 제거
    if action == "enter":
        names.add(name)
    else:
        names.remove(name)

# 사전순 역순으로 정렬하여 출력
for name in sorted(names, reverse=True):
    print(name)