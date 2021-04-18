import sys
n = int(input())
array1 = [int(sys.stdin.readline()) for _ in range(n)]
array2 = list(range(1, n+1))
stack = list([array2.pop(0)])
op = list(['+'])
i = 0
while i < n:
    if len(stack) != 0 and stack[-1] == array1[i]:
        stack.pop()
        i +=1
        op.append('-')
    else:
        if not array2: break
        stack.append(array2.pop(0))
        op.append('+')
        
if i != n: print('NO')
else:
    for operator in op:
        print(operator)