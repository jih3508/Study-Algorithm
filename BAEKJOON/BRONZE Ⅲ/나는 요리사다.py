m = 0
for i in range(5):    
    arr = list(map(int, input().split()))
    if sum(arr) > m:
        index = i + 1; m =sum(arr)
print(index, m)