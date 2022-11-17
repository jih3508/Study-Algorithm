n=int(input())
cnt=0
while n != 6174:
    cnt+=1
    a=(''.join(sorted(str(n).zfill(4))))
    n=int(a[::-1]) - int(a)
print(cnt)