strings = [[]]  # 2차원 리스트 초기화, 세로로 읽은 문자들을 저장할 리스트

# 5줄의 입력을 처리
for _ in range(5):
    line = input()  # 한 줄 읽기

    # 각 줄의 문자를 세로로 저장
    for i in range(len(line)):
        # 필요한 경우 새로운 열(리스트) 추가
        if len(strings) < (i + 1):
            strings.append([])
        # i번째 열에 현재 문자 추가
        strings[i].append(line[i])

# 결과 출력: 모든 열을 먼저 내부적으로 조인한 후, 외부적으로 조인하여 최종 문자열 생성
print(''.join([''.join(line) for line in strings]))