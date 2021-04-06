from collections import deque

#BFS �Լ� ����
def bfs(adj, start, visited):
    s=[]
    # ť(Queue) ������ ���� deque ���̺귯�� ���
    queue = deque([start])
    # ���� ��� �湮 ó��
    visited[start] = True
    #ť�� �� ������ �ݺ�
    while queue:
        # ť���� �ϳ��� ��带 �̾� ����ϱ�
        v = queue.popleft()
        s.append(str(v))
        # ����� �湮���� ���� ������ ť�� ����
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True
    print(' '.join(s))
    
#�� ��尡 ����� ������ ����Ʈ �ڷ������� ǥ��
graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

# �� ��尡 �湮�� ������ ����Ʈ �ڷ������� ǥ��
visited = [False] * 9

#���ǵ� BFS �Լ� ȣ��
bfs(graph, 1, visited)