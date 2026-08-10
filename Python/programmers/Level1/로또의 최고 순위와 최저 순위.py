"""
 문제: 로또의 최고 순위와 최저 순위
 url: https://school.programmers.co.kr/learn/courses/30/lessons/77484
"""

def solution(lottos, win_nums):
    def calculate_rank_by_correct_count(match_count):
        """맞은 번호 개수를 로또 등수로 환산하는 함수"""
        rank_table = {6: 1, 5: 2, 4: 3, 3: 4, 2: 5}
        return rank_table.get(match_count, 6)  # 그 외(0~1개)는 6등(낙첨)

    # 당첨 번호 배열을 set으로 변환 (in 연산을 O(1)로 만들기 위함)
    win_set = set(win_nums)

    unknown_count = 0  # 알아볼 수 없는 번호(0)의 개수
    match_count = 0  # 실제로 당첨 번호와 일치하는 번호의 개수

    for lotto in lottos:
        if lotto == 0:
            # 알아볼 수 없는 번호는 최고 순위 계산 시 당첨된 것으로 가정
            unknown_count += 1
        elif lotto in win_set:
            # 당첨 번호와 실제로 일치하는 경우
            match_count += 1
        # 그 외(0도 아니고 당첨 번호와도 불일치)는 카운트하지 않음

        # 최고 순위: 알아볼 수 없는 번호(0)를 전부 맞춘 것으로 가정
    best_rank = calculate_rank_by_correct_count(match_count + unknown_count)
    # 최저 순위: 알아볼 수 없는 번호(0)를 전부 틀린 것으로 가정
    worst_rank = calculate_rank_by_correct_count(match_count)

    return [best_rank, worst_rank]


print(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19]))
print(solution([0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25]))
print(solution([45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35]))