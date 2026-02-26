# 손상된 ISBN 입력 (예: 9788968322*73)
original = input()

for i in range(10):
    # '*'를 0~9 숫자로 순서대로 대체
    ISBN = original.replace("*", str(i))

    # ISBN-13 가중합 계산
    # 짝수 인덱스(0,2,4...) × 1, 홀수 인덱스(1,3,5...) × 3
    total = sum(
        int(ISBN[j]) if j % 2 == 0 else int(ISBN[j]) * 3
        for j in range(13)
    )

    # 가중합이 10의 배수이면 유효한 ISBN → 해당 숫자 출력 후 종료
    if total % 10 == 0:
        print(i)
        break