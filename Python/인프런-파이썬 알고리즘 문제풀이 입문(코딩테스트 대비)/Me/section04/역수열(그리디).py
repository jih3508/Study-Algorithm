import sys
from collections import deque
sys.stdin=open("./Me/section04/input.txt", "r")

N = int(input())
arr = list(map(int, input().split()))
sequences = [0] * N

for index, num in enumerate(arr):
    cnt = 0
    for i in range(N):
        cnt += sequences[i] == 0
        if cnt == num + 1:
            if sequences[i]:
                continue
            else:
                sequences[i] = index  + 1
                break

print(' '.join(map(str, sequences)))
print(' '.join(map(str, sequences)) 
      == '')

'''
     0 0 0 0 0 0 0 0
1 5  0 0 0 0 1 0 0 0
2 3  0 0 0 2 1 0 0 0
3 4  0 0 0 2 1 0 3 0
4 0  4 0 0 2 1 0 3 0
5 2  4 0 0 2 1 5 3 0
6 1  4 0 6 2 1 5 3 0
7 1  4 0 6 2 1 5 3 7
'''