n = int(input())
i = 1
while i*(i+1)//2 < n:
    i += 1
k = n - i*(i-1)//2
i += 1
print("%d/%d"%(i-k,k) if (i-1)%2 else "%d/%d"%(k,i-k))