'''
1. ������ ���̴� �ִ� 2,500�̰� �ܾ��� ���̴� �ִ� 50�̴�.
2. �ܼ��� ��� ����� ���� ����Ͽ� ������ �ذ��� �� �ִ�.
3. �ð� ���⵵ O(NM)�� �˰������� �ذ��� �� �ֽ��ϴ�.
'''
document = input()
word = input()

index = 0
result = 0

while len(document) - index >= len(word):
    if document[index:index + len(word)] == word: # �������� ���� �ִ� �ܾ ã���� �ϴ� �ܾ��� ���
        result += 1
        index += len(word)
    else:
        index += 1
print(result)