from itertools import permutations

data = ['A', 'B', 'C'] #데이터 준비

result = list(permutations(data, 3))#모든 순열 구하기
print(result)