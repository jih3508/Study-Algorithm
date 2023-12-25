N = int(input())
S = input()

i = 0
result = 0
for index in range(N):
    if S[index] == 'O':
        # 'O' 일때 연산하고 보너스 점수를 늘린다.
        result += index + 1 + i
        i += 1
    else:
        # 'X'일때 보너스 점수 초기화 한다.
        i = 0
        
print(result)