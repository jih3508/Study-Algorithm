# -1이 입력될 때까지 반복
while True:
    # 한 줄씩 정수를 읽어옴
    N = int(input())

    # -1이면 입력 종료
    if N == -1: break

    # N의 약수들을 저장할 리스트 (자신 제외)
    numbers = list()

    # 1부터 N/2까지 반복하여 약수를 찾음
    # N/2를 넘는 수는 N의 약수가 될 수 없음 (N 자신 제외)
    for i in range(1, N // 2 + 1):
        if N % i == 0:
            numbers.append(i)

    # 완전수 여부에 따라 출력 형식 결정
    # N과 약수들의 합이 같으면 완전수
    print( str(N) + ( " = " + " + ".join(map(str, numbers)) if sum(numbers) == N else  " is NOT perfect."))