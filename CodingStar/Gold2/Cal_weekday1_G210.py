#���������� �޸������� Ȯ��
# ���̺귯���Լ� calendar����ؼ� ���ϱ��ϱ�
from calendar import *
days=['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat','Sun']
y,m,d=map(int,input().split())
print(days[weekday(y,m,d)])