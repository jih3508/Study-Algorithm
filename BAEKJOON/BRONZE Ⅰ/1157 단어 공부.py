from collections import Counter
text = list(input().upper()) # �빮�ڷ� ����Ʈ �����.
char = Counter(text) # ������ ��ųʸ����� ���ش�.
count = list(char.values())
char = list(char.keys())
if count.count(max(count)) > 1: print('?') # ������ ���� ���� ���� 2�� �̻��϶�
else: print(char[count.index(max(count))]) # ������ ���� ������ ��