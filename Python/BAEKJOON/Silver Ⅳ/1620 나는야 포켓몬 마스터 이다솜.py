import sys
input = sys.stdin.readline

m, n = map(int, input().split())
dic1 = {}
dic2 = {}
for i in range(1, m+1):
    name = input().replace("\n","")
    dic1[i] = name
    dic2[name] = i

array = []
for _ in range(n):
    quize = input().replace("\n","")
    if quize[0].isdigit():
        array.append(dic1[int(quize)])
    else: array.append(dic2[quize])

print('\n'.join(map(str, array)))