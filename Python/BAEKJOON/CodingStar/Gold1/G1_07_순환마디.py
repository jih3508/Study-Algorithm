def unit(n):
    m = 0 #�ִ� ��ȯ ���̸� ������ ����
    for i in range(2, n+1): 
        p = 0 # ��ȯ üũ�� ����, ���߿��� ���� �뺯�ϴ� ����
        s = [] # ��ȯ ���� ������ ����
        q, r = divmod(1,i) # �м� ���
        while p == 0 and r != 0:
            if q: s.append(q) # ���� 0�ƴϸ� ����
            q, r = divmod(r*10,i) # �������� 10�� ���ؼ� �Ҽ����� ���Ѵ�.
            p = s.count(q) # ���� ����Ʈ �ȿ� ������ ���� ���´�.
        if p: p = len(s[s.index(q):]) #��ȯ�� �ƴϸ� �н��Ѵ�.
        if p > m: #���� ���̺��� ũ�� �����Ѵ�.
            m = p; cycle = s[s.index(q):]; x = i
    print(x, m, cycle)

n = int(input())
unit(n)