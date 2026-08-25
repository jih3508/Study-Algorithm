"""
문제: 숫자게임
url: https://school.programmers.co.kr/learn/courses/30/lessons/12987
"""

def solution(A, B):

    sorted_a = sorted(A)
    sorted_b = sorted(B)

    win_count = 0  # B팀이 획득하는 승점(승리 횟수)
    a_index = 0  # 아직 이기지 못한 A 후보 중 가장 작은 값의 인덱스

    for b_value in sorted_b:
        if a_index >= len(sorted_a):
            break  # 더 이상 매칭할 A가 없으면 종료

        # 현재 B 값이 남아있는 A 최소값보다 크면 승리
        if b_value > sorted_a[a_index]:
            win_count += 1
            a_index += 1  # 이긴 A는 소모(다음 매칭에서 제외)
        # 이기지 못했다면 해당 B는 버리고 다음 B로 넘어감 (a_index는 그대로 유지)

    return win_count


print(solution([5,1,3,7], [2,2,6,8]))
print(solution([2,2,2,2], [1,1,1,1]))