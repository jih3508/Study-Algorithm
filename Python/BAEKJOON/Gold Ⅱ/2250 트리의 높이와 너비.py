import sys
input = sys.stdin.readline

def inorder(node, deep):
    if node != -1:
        if deep in node_level:
            node_level[deep].append(node)
        else: node_level[deep] = [node]
        inorder(tree[node][0], deep+1)
        inorder_array.append(node)
        inorder(tree[node][1], deep + 1)

node_parent = {}
tree = {}

n = int(input())
for _ in range(n):
    data, left_node, right_node = map(int, input().split())
    tree[data] = [left_node, right_node]
    if left_node != -1: node_parent[left_node] = data
    if right_node != -1: node_parent[right_node] = data

root = list(set(range(1, n+1)) - set(node_parent.keys()))[0]
node_level = {}

inorder_array = []
inorder(root, 1)

max_distance = 1
max_level = root

for i in range(1, max(node_level.keys())+1):
    array_index = [inorder_array.index(index) for index in node_level[i]]
    distance = max(array_index)- min(array_index) + 1
    if distance > max_distance:
        max_distance = distance
        max_level = i

print(max_level, max_distance)