def window(n,arr):
    s=[]
    for i in range(len(arr)-n+1):
        k=arr[i:i+n]
        s.append((min(k),max(k)))
    return ','.join(map(str, s))

n=int(input())
arr=list(map(int, input().split()))
print(window(n,arr))