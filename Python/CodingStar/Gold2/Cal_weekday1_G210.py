#문제내용은 메모장으로 확인
# 라이브러리함수 calendar사용해서 요일구하기
from calendar import *
days=['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat','Sun']
y,m,d=map(int,input().split())
print(days[weekday(y,m,d)])