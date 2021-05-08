'''
합 집합 찾기 (Union-Find)알고리즘
- 원소들의 연결 여부를 확인하는 알고리즘
- 더 작은 원소를 부모로 삼도록 설정
'''

def find(x):
    print(x, parent)
    if x == parent[x]:
        return x
    else:
        p = find(parent[x])
        parent[x] = p
        return parent[x]

def union(x, y):
    x = find(x)
    y = find(y)
    parent[y] = x
    
parent = []
    
for i in range(0, 5):
    parent.append(i)
    
union(1, 4)
union(2, 4)

for i in range(1, len(parent)):
    print(find(i), end=' ')