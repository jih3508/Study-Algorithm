#������, ����, ��ȣ�� �̷���� ���ڿ�(string)�� �Է� �޾Ƽ�,
#��� ¦�� ��° ���ڸ� ��%���� ġȯ�Ͽ� ������.
def change(x):
    for i in range(1,len(x),2):
        if x[i].isdigit(): x[i] = '%'
    return ''.join(x)

text=input()
print(change(list(text)))
