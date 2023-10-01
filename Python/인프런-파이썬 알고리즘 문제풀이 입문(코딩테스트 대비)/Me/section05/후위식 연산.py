import sys
sys.stdin=open("./Me/section05/input.txt", "r")

RPN = input()
stack = []
for char in RPN:
    if char == '+':
       stack.append(stack.pop() + stack.pop())
    elif char == '-':
        a = stack.pop()
        b = stack.pop()
        stack.append(b - a)
    elif char == '*':
        stack.append(stack.pop() * stack.pop())
    elif char == '/':
        a = stack.pop()
        b = stack.pop()
        stack.append(b / a)
    else:
        stack.append(int(char))
    #print(char, stack)

print(stack.pop())

'''
352+*9-
3
35
352
352 +
3 7 *
21 9 -
12
'''