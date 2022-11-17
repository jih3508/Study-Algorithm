arr = list(map(int, input().split()))
m = arr.count(max(arr, key=arr.count)) # 갯수가 가장 많은 값 가져온다.
print(m)
for i in sorted(list(set(arr))): # 중복된 값 제거 한 것
    if m == arr.count(i): # 가장 큰 값 가져온다.
        print(i, end=' ')