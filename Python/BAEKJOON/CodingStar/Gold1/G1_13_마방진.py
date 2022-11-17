def magic_constant(n):
    matrix = [[0 for _ in range(n)] for _ in range(n)] #n��n ����Ʈ ����
    x, y = 0, n//2 # 1�� ù�� ���
    for num in range(1, n*n+1):
        matrix[x][y] = num
        if num % n == 0: x+=1 # ����� ���� �Ʒ���
        else:
            # �� ���� �� ĭ ������
            x = (x - 1, n - 1)[x == 0] # ���� ������ �������� ���� ùĭ
            y = (y + 1, 0)[y == n - 1]
    print(n*(n**2+1)//2)
    for i in range(n):
        for j in matrix[i]:
            print(j, end=' ')
        print()

n = int(input())
magic_constant(n)