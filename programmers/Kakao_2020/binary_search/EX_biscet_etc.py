from bisect import bisect_left, bisect_right

#��Ȯ�� ���� x�� �������� �ε��� ��ȯ
def index_of_x(a,x):
    i = bisect_left(a,x)
    if i != len(a) and a[i] == x:
        return i
    return None

# x���� ���� ������ �߿���, ���� ū ���� �ε����� ��ȯ
def index_of_less_than_x(a,x):
    i = bisect_left(a, x)
    # x���� ���� �����Ͱ� �����ϴ� ���
    if i:
        return i - 1 # �� �߿��� ���� ū ���� �ε��� ��ȯ
    # x�� ��� �������� �� ������ ��� None ��ȯ
    return None

# x���� �ۼ��� ���� ������ �߿���, ���� ū ���� �ε����� ��ȯ
def index_of_less_or_equal_than_x(a,x):
    i= bisect_right(a,x):
    # x���� �۰ų� ���� �����Ͱ� �����ϴ� ���
    if i:
        return i - 1 # �� �߿��� ���� ū ���� �ε��� ��ȯ
    # x�� ��� �������� ������ ���� ��� None ��ȯ
    return None

# x���� ū ������ �߿���, ���� ���� ���� �ε����� ��ȯ
def index_of_greater_than_x(a, x):
    i = bisect_right(a, x)
    # x���� ū �����Ͱ� �����ϴ� ���
    if i != len(a):
        return i 
    return None

# x���� ũ�ų� ���� ������ �߿���, ���� ���� ���� �ε����� ��ȯ
def index_of_greater_equal_than_x(a, x):
    i = bisect_left(a, x)
    # x���� ũ�ų� ���� �����Ͱ� �����ϴ� ���
    if i != len(a):
        return i # �� �߿��� ���� ���� ���� �ε��� ��ȯ
    # x�� ��� �������� ������ ū ��� None ��ȯ
    return None
    