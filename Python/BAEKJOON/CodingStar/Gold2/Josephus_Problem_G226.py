def live(arr,n):
    i= n-1 # ù��ŸƮ ��ġ ����
    r=0 # �����ִ� ���� ����
    while len(arr)  != 1: # 1�� ��� ���� ������ ���̱�
        r= (len(arr)+r) % n # �� ���� ���� ������
        del arr[i::n] # �� ���� ���� �׾ ��� ����
        i= n - r - 1 # �� ������ ���� ��ġ ���� (���� - ���� ���� ���� - 1(�迭�� 0��° ���Ͷ�))
    return arr[0]    
        
people, n= map(int, input().split())
print(live(list(range(1, people+1)),n))