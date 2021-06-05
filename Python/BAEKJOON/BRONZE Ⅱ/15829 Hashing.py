L = int(input())
string = input()
print(sum([(ord(string[index]) - ord('a') + 1) * 31 ** index for index in range(L)]) % 1234567891)