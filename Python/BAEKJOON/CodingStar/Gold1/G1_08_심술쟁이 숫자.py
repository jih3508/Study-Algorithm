def ugly_numbers(n):
    s = [1]
    while n>1: # �Ѱ� �� ���̸鼭 ã�´�
        s = list(set(s + list(map(lambda x: s[0]*x, [2, 3, 5])))) # �� ���Ҹ� ���ؼ� ����Ʈ�� �����Ѵ�.
        s.sort()
        del s[0] #ù��° ���Ҹ� ����
        del s[n:] # n���� ���� ���� �����μ� �ӵ��� ������ �Ѵ�.
        n-=1 # ī���͸� ���δ�.
    return s[0]

n = int(input())
print(ugly_numbers(n))