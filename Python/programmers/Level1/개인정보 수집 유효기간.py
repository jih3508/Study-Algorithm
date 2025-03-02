"""
개인정보 수집 유효기간
https://school.programmers.co.kr/learn/courses/30/lessons/150370
"""
def solution(today, terms, privacies):
    # 일자를 일자로 변환
    # year * 12 * 28 + month * 28 + day
    def dateToDays(date: str):
        data = date.split(".")
        year = int(data[0])
        month = int(data[1])
        day = int(data[2])
        return (year * 12 * 28) + (month * 28) + day

    # 약관 정보 저장
    term_info = {}
    for term in terms:
        data = term.split(" ")
        term_info[data[0]] = int(data[1])

    today_day = dateToDays(today)
    answer = []
    size = len(privacies)
    for i in range(size):
        data = privacies[i].split(" ")
        # 약관이 오늘까지 이면 answer에 추가
        if today_day >= (dateToDays(data[0]) + term_info[data[1]] * 28):
            answer.append(i + 1)

    return answer


today = "2022.05.19"
terms = ["A 6", "B 12", "C 3"]
privacies = ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
print(solution(today, terms, privacies))

today = "2020.01.01"
terms = ["Z 3", "D 5"]
privacies = ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]
print(solution(today, terms, privacies))
