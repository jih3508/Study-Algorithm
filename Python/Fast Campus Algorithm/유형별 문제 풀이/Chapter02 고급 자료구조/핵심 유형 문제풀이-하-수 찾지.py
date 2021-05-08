'''
1. 특정 정수의 등장 여부만을 간단히 체크하면 된다.
2. Python에서는 dictionary자료형을 해시처럼 사용할 수 있다.
3. 본 문제는 set 자료형을 이용해 더욱 간단히 풀 수 있다.
'''

n = int(input())
array = set(map(int, input().split()))
m = int(input())
x = list(map(int, input().split()))

for i in x:
    if i not in array:
        print('0')
    else:
        print('1')