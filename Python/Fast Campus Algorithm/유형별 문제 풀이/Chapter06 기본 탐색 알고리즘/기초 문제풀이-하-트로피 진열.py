'''
1. ���� ���� �÷��� �ִ� Ʈ���ǵ鿡 ���Ͽ� ���ʿ���, �����ʿ��� ���� �� ���̴� Ʈ������ ���� ���� ���մϴ�.
2. Ʈ������ ���� N�� �ִ� 50�̹Ƿ� �ܼ��� �����ϸ� �ȴ�.
'''
def ascending(array):
    now = array[0]
    result = 1
    for i in range(1, len(array)):
        if now < array[i]:
            result += 1
            now = array[1]
    return result

n = int(input())
array = []

for _ in range(n):
    array.append(int(input()))

print(ascending(array))
array.reverse()
print(ascending(array))