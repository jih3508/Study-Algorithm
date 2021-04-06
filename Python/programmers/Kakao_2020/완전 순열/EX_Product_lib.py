from itertools import product

data = ['A', 'B', 'C'] #데이터 준비

result = list(product(data, repeat=2))# 2개를 뽑는 모든 순열 구하기 (중복 허용)
print(result)