from itertools import permutations

def solution(n, weak, dist):
    # ���̸� 2��� �÷��� '����'�� ���� ���·� �����ϱ�
    length = len(weak)
    for i in range(length):
        weak.append(weak[i]+n)
    answer = len(dist) + 1 # ������ ģ�� ���� �ּڰ��� ã�ƾ� �ϹǷ� len(dist) + 1�� �ʱ�ȭ
    # 0���� length - 1������ ��ġ�� ���� ���������� ����
    for start in range(length):
        # ģ���� �����ϴ� ��� ��� ������ ���Ͽ� Ȯ��
        for friends in list(permutations(dist, len(dist))):
            count = 1 #������ ģ���� ��
            # �ش� ģ���� ������ �� �ִ� ������ ��ġ
            position = weak[start] + friends[count - 1]
            # ���������� ��� ����� ������ Ȯ��
            for index in range(start, start + length):
                #������ �� �ִ� ��ġ�� ����� ���
                if position < weak[index]:
                    count += 1 # ���ο� ģ���� ����
                    if count > len(dist): # �� ������ �Ұ����ϴٸ� ����
                        break
                    position = weak[index] + friends[count - 1]
            answer = min(answer, count) # �ּڰ� ���
    if answer > len(dist): return -1
    return answer

print(solution(12,[1,5,6,10], [1,2,3,4]))