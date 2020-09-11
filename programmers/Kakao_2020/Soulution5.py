#���� ��ġ�� �������� '������' ���������� Ȯ���ϴ� �Լ�
def possible(answer):
    for x, y, stuff in answer:
        if stuff == 0: # ��ġ�� ���� '���'�� ���
            # '�ٴ�, ��' Ȥ�� '���� �� �� �� �κ� ��' Ȥ�� '�ٸ� ��� ��'��� ����
            if y == 0 or [x - 1, y, 1] in answer or [x, y, 1] in answer or [x, y - 1, 0] in answer:
                continue
            return False # �ƴ϶�� ����(False) ��ȯ
        elif stuff == 1: # ��ġ�� ���� '��'�� ���
            # '���� �� �κ��� ��� ��' Ȥ�� '���� �� �κ��� �ٸ� ���� ���ÿ� ����' �̶�� ����
            if [x, y -1 , 0] in answer or [x + 1, y - 1, 0] in answer or ([x - 1 , y, 1] in answer and [x + 1, y, 1] in answer):
                continue
            return False
    return True

def solution(n, build_frame):
    answer = []
    for frame in build_frame: # �۾�(frame)�� ������ �ִ� 1,000��
        x, y, stuff, operate = frame
        if operate == 0: # �����ϴ� ���
            answer.remove([x, y, stuff]) #�ϴ� ������ �� �� �ڿ�
            if not possible(answer): #������ ���������� Ȯ���մϴ�.
                answer.append([x, y, stuff]) #������ ������ �ƴ϶�� �ٽ� ��ġ
        if operate == 1: #��ġ�ϴ� ���
            answer.append([x, y, stuff]) # �ϴ� ��ġ�� �� �� �ڿ�
            if not possible(answer): # ������ ���������� Ȯ���մϴ�.
                answer.remove([x, y, stuff]) # ������ �������� �ƴ϶�� �ٽ� ����
    return sorted(answer)

print(solution(5,[[1,0,0,1],[1,1,1,1],[2,1,0,1],[2,2,1,1],[5,0,0,1],[5,1,0,1],[4,2,1,1],[3,2,1,1]]))