from itertools import combinations

data = ['A', 'B', 'C'] #데이터 준비

result = list(combinations(data, 2))#모든 순열 구하기
print(result)