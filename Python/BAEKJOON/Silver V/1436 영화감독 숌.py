# 666 부터 시작하고 N이 1이하이면 그래로 출력하기 때문에 count를 1부터 시작
# 한개 씩 증가하면서 i를 문자열로 바꿔서 '666'이 있으면 count를 1개씩 증가 시킨다.
N = int(input())
count = 1
i = 666 # 맨처음 시작할 숫자
while count < N:
    i+= 1
    if str(i).count('666'): count += 1
print(i)