import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split()))
result = [arr[0]] 
for i in range(1 , N):
    hap = sum(result)
    result.append(arr[i] * (i + 1) - hap)
    
print(' '.join(map(str, result)))