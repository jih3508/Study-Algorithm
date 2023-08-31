import sys
input = sys.stdin.readline

N = int(input())
A = list(map(int, input().split()))
B = [A[0]] 
for i in range(1 , N):
    B.append(A[i] * (i + 1) - sum(B))
    
print(' '.join(map(str, B)))