def life(line, n):
    for _ in range(n):
        line = line[-1] + line + line[0] # �տ� n-1�� �ڿ� 0���� ������ ������ ���Ѵ�.
        new = ''
        for i in range(1,len(line)-1): #���ο� ���� �����Ѵ�.
            # 111 �� 1 , 101 �� 0, 100 �� 1, 001 �� 1 2�� ������ ���� ���� Ȯ�� ������ 
            new += str(sum([int(j) for j in line[i-1:i+2]])%2) #3�� ���ؼ� 2�� ������.
        line = new
    return line

string, n = input().split()
print(life(string, int(n)))