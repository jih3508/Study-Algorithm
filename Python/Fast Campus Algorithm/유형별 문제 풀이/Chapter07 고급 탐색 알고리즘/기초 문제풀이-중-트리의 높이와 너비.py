'''
- 중위 순회를 이용하면 X축을 기준으로 왼쪽부터 방문한다는 특징이 있습니다.
- 이 문제는 중위 순회 알고리즘을 이용하고, 추가적으로 Level값을 지정하도록 하여 문제를 해결할 수 있다.
'''

class Node:
    def __init__(self, number, left_node, right_node):
        self.parent = -1
        self.number = number
        self.left_node = left_node
        self.right_node = right_node

def in_order(node, level):
    global level_depth, x
    level_depth = max(level_depth, level)
    if node.left_node != -1:
        in_order(tree[node.left_node])
    level_min[level] = min(level_min[level], x)
    level_max[level] = max(level_max[level], x)
    x +=1
    if node.right_node != -1:
        in_order(tree[node.right_node], level + 1)
        
n = int(input())
tree = {}
level_min = [n]
level_max = [0]
root = -1
x = 1
level_depth = 1

for i in range(1, n + 1):
    tree[i] = Node(i, -1, -1)
    level_min.append(n)
    level_max.append(0)
    
for _ in range(n):
    number, left_node, right_node = map(int, input().split())
    tree[number].left_node = left_node
    tree[number].right_node = right_node
    if left_node != -1: tree[left_node].parent = number
    if right_node != -1: tree[right_node].parent = number
    
for i in range(1, n + 1):
    if tree[i].parent == -1:
        root = i

in_order(tree[root], 1)

result_level = 1
result_width = level_max[1] - level_min[1] + 1
for i in range(2, level_depth + 1):
    width = level_max[i] - level_min[i] + 1
    if result_width < width:
        result_level = i
        result_width = width

print(result_level, result_width)