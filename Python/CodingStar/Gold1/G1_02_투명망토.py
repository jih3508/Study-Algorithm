arr = [int(i) for i in input().split(', ')]
arr.sort() # 가장 최적시간을 위해서 정렬한다.
n = len(arr) 
if n <= 2: print(arr[-1]) # 길이가 2 이하일 경우 맨 마직막 요소를 출력
else:
    t1 = arr[0] * ((n-1)//2) # 가장 짧은 시간 구하는 수
    t2 = arr[1] * ((n//2)*2 - 1) # 2번째로 짧은 사람 이동시간
    t3 = sum(arr[-1:1:-2])# 뒤에서 부터 2명씩 짝찌어서 이동시간
    print(t1 + t2 + t3)# 모든 이동시간 구한다.