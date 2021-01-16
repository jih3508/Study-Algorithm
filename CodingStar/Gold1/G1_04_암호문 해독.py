def incoder(arr, key):
    # key 위치와 리스트 위치랑 연관 시켜서 XOR 연산한다.
    return ''.join([chr(arr[i] ^ ord(key[i%len(key)])) for i in range(len(arr))])

arr = list(map(int, input().split()))
key = input()
print(incoder(arr, key))