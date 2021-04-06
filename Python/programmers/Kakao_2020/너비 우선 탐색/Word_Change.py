from collections import deque

# �ܾ ��ȯ�� �� �ִ� ��� (1�� ������ ���ĺ��� �ٸ� ���)
def possible(begin, target):
    length = len(begin)
    count = 0 # �ٸ� ���ĺ��� ����
    for i in range(length):
        # �� ���ĺ��� ���� �ٸ� ������ ī��Ʈ
        if begin[i] != target[i]:
            count += 1
        if count == 2: # ���ĺ��� 2�� �̻� �ٸ��ٸ� ����(False) ��ȯ
            return False
    return True

def solution(begin, target, words):
    visited = {begin: 0} # Ư�� �ܾ���� �ּ� ��ȯ Ƚ�� ���
    # �ʺ� �켱 Ž��(BFS) ����
    q = deque([begin])
    while q:
        now = q.popleft()
        for word in words: # ��� �ܾ Ȯ���ϸ�
            # ���� �湮���� �ʾ����� ��ȯ�� �����ϴٸ� �湮 ó��
            if word not in visited and possible(now, word):
                visited[word] = visited[now] + 1
                print(visited , word, now)
                q.append(word)
                print(q)
    # ��ǥ �ܾ�� ��ȯ�� �����ϴٸ� �ּ� ��ȯ Ƚ�� ���
    if target in visited:
        return visited[target]
    return 0

print(solution("hit", "cog", ["hot", "dot", "dog", "lot", "log", "cog"]))