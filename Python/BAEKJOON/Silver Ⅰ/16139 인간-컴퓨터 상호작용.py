from collections import Counter
import sys

input = sys.stdin.readline
print = sys.stdout.write

S = input()
n = len(S)
dic = {char : [0] * (n + 1) for char in Counter(S).keys()}
dic[S[0]][1] = 1
for i in range(1, n):
    for key in dic.keys():
        dic[key][i + 1] = dic[key][i] + int(S[i] == key)


for _ in range(int(input())):
    char, start, end = input().split()
    start, end = int(start), int(end)
    result = 0
    if char in dic.keys():
        result = dic[char][end + 1] - dic[char][start]
    print("%d\n"%(result))