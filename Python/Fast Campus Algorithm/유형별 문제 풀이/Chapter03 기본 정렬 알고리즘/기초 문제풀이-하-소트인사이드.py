'''
1. 자릿수를 기준으로 정렬하므로 9부터 0까지 차례대로 확인한다.
2. 각 숫자에 대하여 해당 숫자의 개수를 계산하여 출력한다.
'''

array = input()

for i in range(9, -1, -1):
    for j in array:
        if int(j) == i:
            print(i, end='')