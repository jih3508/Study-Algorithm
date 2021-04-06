from bisect import bisect_left, bisect_right

# ���� [left value, right value]�� �������� ������ ��ȯ�ϴ� �Լ�
def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a, right_value)
    left_index = bisect_left(a, left_value)
    return right_index - left_index

# ��� �ܾ���� ���̸��� ����� �����ϱ� ���� ����Ʈ
data = [[] for _ in range(10001)]
# ��� �ܾ���� ���̸��� ����� ������ �����ϱ� ���� ����Ʈ
reversed_data = [[] for _ in range(10001)]
def solution(words, queries):
    answer = []
    for word in words: # ��� �ܾ ���̻� ���ϵ�ī�� �迭, ���λ� ���ϵ�ī�� �迭�� ���� ����
        data[len(word)].append(word)
        reversed_data[len(word)].append(word[::-1])
        
    for i in range(10001): # ���� Ž���� �����ϱ� ���� �� �ܾ�� ���� ����
        data[i].sort()
        reversed_data[i].sort()
        
    for q in queries: # ������ �ϳ��� Ȯ���ϸ� ó��
        if q[0] != '?':
            res = count_by_range(data[len(q)], q.replace('?', 'a'), q.replace('?', 'z'))
        else: # ���λ翡 ���ϵ� ī�尡 ���� ���
            res = count_by_range(reversed_data[len(q)], q[::-1].replace('?', 'a'), q[::-1].replace('?', 'z'))
        # �˻��� �ܾ��� ������ ����
        answer.append(res)
    return answer

print(solution(["frodo", "front", "frost", "frozen", "frame", "kakao"],["fro??", "????o", "fr???", "fro???", "pro?"]))