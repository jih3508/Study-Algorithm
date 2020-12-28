m = 0
for i in range(5):    
    arr = list(map(int, input().split())) # 입력해서 리스트로 만들어 준다.
    if sum(arr) > m: # 리스트를 더해서 이전에서 가장 큰값이랑 비교해서 크면 몇 번째 참가자와 점수를 저장한다.
        index = i + 1; m =sum(arr)
print(index, m)
