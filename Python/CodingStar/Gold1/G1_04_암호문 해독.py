def incoder(arr, key):
    # key ��ġ�� ����Ʈ ��ġ�� ���� ���Ѽ� XOR �����Ѵ�.
    return ''.join([chr(arr[i] ^ ord(key[i%len(key)])) for i in range(len(arr))])

arr = list(map(int, input().split()))
key = input()
print(incoder(arr, key))