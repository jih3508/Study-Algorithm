n = int(input())
cnt, i = 0, 1
while n:
    n -= i
    cnt += 1
    i = (i+1,1)[n <= i]
print(cnt)