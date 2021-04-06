N = int(input())
arr1 = list(map(int, input().split()))
M = int(input())
arr2 = list(map(int, input().split()))
arr1.sort()
for data in arr2:
    l = 0
    r = N - 1
    flag = 0
    #ÀÌºĞ Å½»ö
    while l <= r:
        middle = (l+r)//2
        if data == arr1[middle]: 
            flag = 1
            break
        elif data < arr1[middle]:
            r = middle - 1
        else:
            l = middle + 1
    print(flag)