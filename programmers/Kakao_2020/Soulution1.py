def data(s):
    answer=len(s)
    sentens=s
    # 1�� ����(step)���� ���� ������ �÷����� Ȯ��
    for step in range(1,len(s)):
        count=1
        prev=s[:step] #�տ������� step ��ŭ�� ���ڿ� ����
        compressed=''
        #����(step) ũ�⸸ŭ ������Ű�� ���� ���ڿ��� ��
        for i in range(step, len(s), step):
            #���� ���¿� �����ϴٸ�, ���� ȸ��(count) ����
            if prev == s[i:i+step]: count+=1
            #�ٸ� ���ڿ��� ���Դٸ� (�� �̻� �������� ���ϴ� �����)
            else:
                compressed += str(count) + prev if count > 1 else prev
                prev = s[i:i+step] # �ٽ� �ʱ�ȭ
                count=1
        #�����ִ� ���ڿ��� ���ؼ� ó��        
        compressed += str(count) + prev if count > 1 else prev
        #��������� ���� ���ڿ��� ���� ª�� ���� ����
        if answer> len(compressed):
            answer = len(compressed)
            sentens = compressed
    return answer, sentens            

s=input()
print("%d %s"%data(s))