import sys
from collections import deque
sys.stdin=open("./Me/section04/input.txt", "r")

N = int(input())
arr = deque(list(map(int, input().split())))
sequences = []
result = ''

if arr[0] > arr[-1]:
    sequences.append(arr.pop())
    result += 'R'
else:
    sequences.append(arr.popleft())
    result += 'L'

while arr:
    if len(arr) == 1:
        if arr[0] > sequences[-1]:
            sequences.append(arr.pop())
            result += 'L'
        break
    else:
        # 수열이 오른쪽 왼쪽 둘다 올 수 있는 경우
        if sequences[-1] < arr[0] and sequences[-1] < arr[-1]:
            if arr[0] < arr[-1]:
                sequences.append(arr.popleft())
                result += 'L'
            else:
                sequences.append(arr.pop())
                result += 'R'
        # 수열이 왼쪽이 올경우                
        elif sequences[-1] < arr[0]:
            sequences.append(arr.popleft())
            result += 'L'
        # 수열이 오른쪽이 올경우
        elif sequences[-1] < arr[-1]:
            sequences.append(arr.pop())
            result += 'R'
        # 아에 못올 경우
        else:
            break

#print(sequences)
print(len(sequences))
print(result)