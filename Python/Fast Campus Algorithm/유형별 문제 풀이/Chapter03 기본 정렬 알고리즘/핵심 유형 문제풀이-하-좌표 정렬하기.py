'''
1. (x좌표, y좌표)를 입력 받은 뒤 x 좌표, y 좌표 순서대로 차례대로 오름차순 정렬합니다.
2. 파이썬의 기본 정렬 라이브러리는 기본적으로 튜플의 인덱스 순서대로 오름차순 정렬한다.
3. 따라서 단순히 기본 정렬 라이브러리를 이용하면 된다. (key 속성 설정 없이)
'''

n = int(input())

array = []
for _ in range(n):
    x, y = map(int, input().split(' '))
    array.append((x, y))
    
array = sorted(array)

for i in array:
    print(i[0], i[1])