'''
1. 자연수 N의 범위(3<=N<=9)의 매우 한정적이므로 완전 탐색으로 문제를 해결할 수 있다.
2. 수의 리스트와 연산자 리스트를 분리하여 모든 경우의 수를 계산한다.
3. 가능한 모든 경우를 고려하여 연산자 리스트를 만드는 것이 관건(재귀 함수 이용)
4. 파이썬의 eval() 함수를 이용하여 문자열 형태의 표현식을 계산할 수 있다.
'''

import copy

def recursive(array, n):
    if len(array) == n:
        operators_list.append(copy.deepcopy(array))
        return
    array.append(' ')
    recursive(array, n)
    array.pop()
    
    array.append('+')
    recursive(array, n)
    array.pop()
    
    array.append('-')
    recursive(array, n)
    array.pop()

test_case = int(input())

for _ in range(test_case):
    operators_list = []
    n = int(input())
    recursive([], n - 1)
    
    integers = [i for i in range(1, n + 1)]
    
    for operators in operators_list:
        string = ""
        for i in range(n-1):
            string += str(integers[i]) + operators[i]
        string += str(integers[-1])
        if eval(string.replace(" ", "")) == 0:
            print(string)
    print()