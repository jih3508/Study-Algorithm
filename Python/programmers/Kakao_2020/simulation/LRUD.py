n = int(input()) # N �Է� �ޱ�
x,y =1 , 1
plans = input().split() # ��ȹ�� �Է� �ޱ�

# L, R, U , D�� ���� �̵� ����
dx = [0, 0 , -1 , 1]
dy = [-1, 1, 0, 0 ]
move_types = ['L', 'R', 'U', 'D']

# �̵� ��ȹ�� �ϳ��� Ȯ���ϱ�
for plan in plans:
    # �̵� �� ��ǥ ���ϱ�
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    # ������ ����� ��� ����
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
    # �̵� ����
    x, y = nx, ny
print(x, y)
