N = int(input())
gradles = list(map(int, input().split()))
avg = int(round(sum(gradles)/N, 0)) # 평균값
sub_gradles = []

# 점수와 평균값 차이
for index, gradle in enumerate(gradles):
    sub_gradles.append(gradle - avg)

min_result = min(sub_gradles, key= lambda x: abs(x))

#평균값 가까운 수 구하기
result_list = []
for index, gradle in enumerate(gradles):
    if abs(min_result) == abs(sub_gradles[index]):
        result_list.append((index, gradle))

result = max(result_list, key= lambda x: x[1])
print(avg, result[0] + 1)