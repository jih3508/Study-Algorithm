'''
1. �ؽø� Ȱ���� Union-Find �˰����� �̿��� �L�� Ǯ �� �ֽ��ϴ�.
2. Python������ dictionary �ڷ����� �ؽ�ó�� ����� �� �ִ�.
'''
# �ڽ��� ����� ��� ã�´�.
def find(x):
    if x == parent[x]: # ����� ����� ������ ����
        return x
    else:
        p = find(parent[x]) # ���� �� ��� ã�´�.
        parent[x] = p
        return parent[x]

def union(x, y): # ������ -> ���� �� ��� ã�´�.
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