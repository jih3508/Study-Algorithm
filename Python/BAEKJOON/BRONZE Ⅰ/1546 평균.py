n = int(input())
arr = list(map(int, input().split()))
m = max(arr) # 최대값
for i in range(n):
    arr[i] = arr[i] / m *100 #최고점 기준으로 점수 수정한다.
print(sum(arr)/n) # 평균값 출력