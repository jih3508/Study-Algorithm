#���� Ž�� �ҽ��ڵ�
def binary_search(data, start, end, target):
    while start <= end:
        mid = (start + end) // 2
        # ã�� ��� �߰��� �ε��� ��ȯ
        if data[mid] == target:
            return mid
        #�߰����� ������ ū ��� ������ Ȯ��
        elif data[mid] <target:
            start = mid + 1
        #�߰����� ������ ���� ��� ���� Ȯ��
        else:
            end = mid -1
    return None

#����Ʈ [1, 3, 5, 7, 9]���� ���� 7�� ���� Ž���ϱ�
data = [1, 3, 5, 7, 9]
result = binary_search(data, 0 , len(data)-1, 7)

if result == None:
    print("Ž�� ����")
else:
    print("Ž�� ����: �ε���", result)