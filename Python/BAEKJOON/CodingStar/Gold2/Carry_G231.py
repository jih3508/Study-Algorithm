#�� �ڸ����� ���ؼ� �ڸ� �ø� ���ϱ�
def carry(a,b):
    m=max(len(str(a)),len(str(b))) # ū �ڸ� �� ���ϱ�
    # �� �ڸ� ���ؼ� �ڸ� �� ��ŭ ������ �ڸ� �÷� ���� ���� ���Ѵ�.
    return sum([(lambda x: (a%x+b%x)//x)(10**n)  for n in range(1,m+1)])

x,y = map(int, input().split())
print(carry(x,y))
# (lambda x: (a%x+b%x)//x)(10**n): (10**n)�� ���� x�� �Ѱ���
