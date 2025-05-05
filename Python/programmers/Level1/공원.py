"""
- 공원
- url: https://school.programmers.co.kr/learn/courses/30/lessons/340198

"""

def solution(mats, park):

    # 공원의 행과 열 크기를 저장
    row = len(park)
    col = len(park[0])
    """
    - dp 배열: 각 위치에서 가능한 최대 정사각형 크기를 저장할 배열
    - (i,j) 위치에서 왼쪽 상단으로 확장할 수 있는 최대 정사각형의 한 변 길이
    - 패딩을 위해 크기를 1씩 더 크게 설정
    """
    dp =[[0] * (col + 1) for _ in range(row + 1)]

    # 공원에서 가능한 최대 정사각형의 크기
    max_value = 0

    # 모든 위치를 순회하며 dp 배열 채우기
    for i in range(row):
        for j in range(col):
            # 현재 위치에 사람이 없는 경우 ("-1")
            # 왼쪽(dp[i+1][j]), 위쪽(dp[i][j+1]), 왼쪽 위 대각선(dp[i][j]) 중 최소값에 1을 더함
            # 사람이 있는 경우 돗자리를 깔 수 없으므로 0으로 설정
            dp[i + 1][j + 1] = min(dp[i][j + 1], dp[i + 1][j], dp[i][j]) + 1 if park[i][j] == "-1" else 0

            # 최대 정사각형 크기 업데이트
            max_value = max(max_value, dp[i + 1][j + 1])

    # 돗자리 크기를 내림차순으로 정렬
    mats.sort(reverse=True)

    # 결과값 초기화 (-1은 아무 돗자리도 깔 수 없는 경우)
    result = -1

    # 내림차순으로 정렬된 돗자리 배열을 순회하며
    # 공원에서 가능한 최대 정사각형 크기보다 작거나 같은
    # 첫 번째 돗자리 크기를 찾음
    for mat in mats:
        if max_value >= mat:
            result = mat # 해당 크기의 돗자리를 깔 수 있음
            break # 가장 큰 돗자리를 찾았으므로 반복문 종료

    return result

mats = [5,3,2]
park = 	[["A", "A", "-1", "B", "B", "B", "B", "-1"], ["A", "A", "-1", "B", "B", "B", "B", "-1"], ["-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"], ["D", "D", "-1", "-1", "-1", "-1", "E", "-1"], ["D", "D", "-1", "-1", "-1", "-1", "-1", "F"], ["D", "D", "-1", "-1", "-1", "-1", "E", "-1"]]
print(solution(mats, park))