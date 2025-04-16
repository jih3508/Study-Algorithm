# 등급에 따른 과목평점 정의
grades = {
    "A+" : 4.5,
    "A0": 4.0,
    "B+": 3.5,
    "B0": 3.0,
    "C+": 2.5,
    "C0": 2.0,
    "D+": 1.5,
    "D0": 1.0,
    "F": 0.0
}

s = 0 # (학점 × 과목평점)의 총합을 저장할 변수
count = 0 # 총 학점을 저장할 변수

for _ in range(20):
    _, credit, grade = input().split()
    credit = float(credit) # 학점

    #  P/F 과목 중 P인 경우 계산에서 제외
    if grade != "P":
        s += credit * grades[grade]
        count += credit

# 전공평점 계산 = (학점 × 과목평점)의 총합 / 총 학점
print(s / count)