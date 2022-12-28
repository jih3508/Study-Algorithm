V = int(input())

def dfs(start):
    stack = [start]
    distance = [0] * (V + 1)
    while stack:
        node = stack.pop()
        for next_node, weight in tree[node]:
            if distance[next_node] == 0 and next_node != start:
                distance[next_node] = distance[node] + weight
                stack.append(next_node)
    return distance.index(max(distance)) ,max(distance)

tree = {i : [] for i in range(1, V + 1)}
for _ in range(V):
    node, *array = map(int, input().split())
    for i in range(len(array)//2):
        tree[node].append((array[i * 2], array[i * 2 +1]))

node = dfs(1)[0]

print(dfs(node)[1])