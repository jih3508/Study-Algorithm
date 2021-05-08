'''
1. 해시를 활용한 Union-Find 알고리즘을 이용해 묹를 풀 수 있습니다.
2. Python에서는 dictionary 자료형을 해시처럼 사용할 수 있다.
'''
# 자신의 연결된 사람 찾는다.
def find(x):
    if x == parent[x]: # 연결된 사람이 없으면 종료
        return x
    else:
        p = find(parent[x]) # 연결 된 사람 찾는다.
        parent[x] = p
        return parent[x]

def union(x, y): # 합집합 -> 연결 된 사람 찾는다.
    x = find(x)
    y = find(y)
    
    if x != y: #
        parent[y] = x
        number[x] += number[y]
      
test_case = int(input())

for _ in range(test_case):
    parent = dict()
    number = dict()
    
    f = int(input())
    
    for _ in range(f):
        x, y = input().split(' ')
        
        if x not in parent:
            parent[x] = x
            number[x] = 1
        if y not in parent:
            parent[y] = y
            number[y] = 1
        
        union(x, y)
        print(number[find(x)])