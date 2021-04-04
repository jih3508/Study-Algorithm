def Merge(left,right):
    merged = []
    left_point, right_point = 0, 0
    while len(left) > left_point and len(right) > right_point:
        if left[left_point] > right[right_point]:
            merged.append(right[right_point])
            right_point +=1
        else:
            merged.append(left[left_point])
            left_point += 1
    
    while len(left) > left_point:
        merged.append(left[left_point])
        left_point += 1
    
    while len(right) > right_point:
        merged.append(right[right_point])
        right_point += 1
    return merged
    
def MergeSplit(arr):
    if len(arr) < 2:
        return arr
    m = len(arr) // 2
    left = MergeSplit(arr[:m])
    right = MergeSplit(arr[m:])
    return Merge(left, right)

N = int(input())
arr = [int(input()) for i in range(N) ]
for num in MergeSplit(arr):
    print(num)