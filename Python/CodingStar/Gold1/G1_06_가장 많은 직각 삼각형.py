from math import sqrt
def reg(n):
    triangle = [] # �ﰢ�� ���� �����ϴ� ����Ʈ
    for a in range(1,n//2+1): # �Ѻ��� ���� �����Ϸ� �����Ѵ�.
        for b in range(a, n//2+1): # b�� a���� ũ���ؼ� for�� ������ Ƚ�� ���δ�.
            c = sqrt(a**2 + b**2) # ��������
            if a + b + c > n: break  # �ﰢ�� �ѷ��� ������ �� pass�Ѵ�.
            elif c%1 == 0: triangle.append(int(a+b+c)) #�������̰� �����̸� ����Ʈ�� �����Ѵ�.
    m = max(triangle, key=triangle.count) #Ƚ���� ���帹�� ���� ���� ū ���� ���Ѵ�.
    return m, triangle.count(m)   

n = int(input())
print("%d %d"%reg(n))
