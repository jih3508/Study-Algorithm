import sys
sys.stdin=open("./Me/section05/input.txt", "r")

number , n = map(int, input().split())
number = list(map(int, list(str(number))))

cnt = 0
stack = [number[0]]
for i in range(1, len(number)):
    while stack and number[i] > stack[-1] and cnt < n:
        cnt += 1
        stack.pop()
    if len(stack) == len(number) - n: break
    print(stack)
    stack.append(number[i])

print(''.join(map(str, stack)))
print(''.join(map(str, stack)) == 
      '99999978937689437896743489673489673986')
 
'''
n  stack 5276823
0  5
0  5 2
0  5 2 7
2  7 6
2  7 6 8
3  7 8 2 3 
'''    
    
