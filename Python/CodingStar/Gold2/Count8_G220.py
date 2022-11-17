def subarray(i,p=[]):
    global s
    s+= sum(p)
    if i == len(arr): return
    for j in range(i,len(arr)):
        subarray(i+1,p+[arr[j]])
        

arr=list(map(int, input().split()))
s=0
subarray(0)
print(s)