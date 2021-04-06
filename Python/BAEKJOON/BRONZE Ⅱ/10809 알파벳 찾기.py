alphabet = [-1 for _ in range(26)]
a = ord('a')
s = list(input())
ss = set(s)
for i in ss:
    alphabet[ord(i)-a] = s.index(i)
print(' '.join(map(str, alphabet)))