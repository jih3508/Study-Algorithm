'''
1.(나이, 이름)의 정보를 입력 받은 뒤에 나이를 기준으로 정렬한다.
2. 파이썬의 기본 정렬 라이브러리를 이용하면 된다.
3. 나이가 동일한 경우, 먼저 입력된 이름 순서를 따르도록 key 속성을 설정해야 한다.
'''
n = int(input())

array = []

for _ in range(n):
    input_data = input().split(' ')
    array.append((int(input_data[0]), input_data[1]))

array = sorted(array, key = lambda x:x[0])
for i in array:
    print(i[0], i[1])