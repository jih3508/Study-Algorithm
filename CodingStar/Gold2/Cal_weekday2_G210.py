#문제내용은 메모장으로 확인
# 라이브러리함수 사용하지 않고 요일구하기
week=['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
month=[31,28,31,30,31,30,31,31,30,31,30,31]
y,m,d=map(int, input().split())
month[1]+= (y % 4 ==0 and y % 100 != 0) or (y %400 == 0) #윤년, 평년 구하기
k=y-1
t=k*365+k//4-k//100+k//400+sum(month[:m-1])+d #전체 일수 구하기
print(week[t%7])