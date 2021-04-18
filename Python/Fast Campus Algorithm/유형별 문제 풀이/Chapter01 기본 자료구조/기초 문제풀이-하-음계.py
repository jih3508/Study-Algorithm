#1. 리스트에서의 원소를 차례대로 비교합니다.
#2. 비교할 때 두 원소를 기준으로 오름차순/내림차순 여부를 체크합니다.

a = list(map(int, input().split(' ')))

ascending = True
descending = True
for i in range(1, 8):
    if a[i] > a[i-1]:
        descending = False
    elif a[i] < a[i - 1]:
        ascending = False
if ascending:
    print('ascending')
elif descending:
    print('descending')
else: 
    print('mixed')