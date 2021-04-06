n = int(input())
for _ in range(n):
    s = 0
    for i in input().split('X'):
        k = len(i)
        s += k*(k+1)//2
    print(s)