"""
 * 문제: 유연근무제
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/388351
"""

def solution(schedules, timelogs, startday):

    # 주어진 출근 시각이 허용 시간(희망시각 + 10분)을 초과했는지 확인하는 메소드
    def is_safe(schedule, time_log):
        hour = schedule // 100 # 희망 출근 시각의 시간 부분
        minute = schedule % 100 + 10 # 희망 출근 시각의 분 부분 + 10분

        # 시간 계산 후 허용 마감 시각 계산 (분이 60을 넘으면 시간으로 올림)
        after_10 = (hour + minute // 60) * 100 + (minute % 60)

        return time_log > after_10 # 실제 출근 시각이 허용 시간을 초과하면 true 반환

    result = 0

    # 각 직원별로 일주일간의 출근 기록을 확인
    for i in range(len(schedules)):

        flag = True # 해당 직원이 상품을 받을 수 있는지 여부 (true: 상품 받을 수 있음)

        # 일주일 동안의 각 날짜별 출근 기록 확인
        for j in range(7):
            day = (j + startday - 1) % 7 # 실제 요일 계산 (0: 월요일 ~ 6: 일요일)

            # 평일(월~금, day <= 4)이고 늦게 출근한 경우
            if day <= 4 and is_safe(schedules[i], timelogs[i][j]):
                flag = False
                break
        # 일주일 내내 늦지 않았다면 상품 대상자로 카운트
        if flag:
            result += 1

    return result


schedules = [700, 800, 1100];
timelogs = [[710, 2359, 1050, 700, 650, 631, 659], [800, 801, 805, 800, 759, 810, 809], [1105, 1001, 1002, 600, 1059, 1001, 1100]];
print(solution(schedules, timelogs, 5));

schedules = [730, 855, 700, 720];
timelogs = [[710, 700, 650, 735, 700, 931, 912], [908, 901, 805, 815, 800, 831, 835], [705, 701, 702, 705, 710, 710, 711], [707, 731, 859, 913, 934, 931, 905]];
print(solution(schedules, timelogs, 1));
