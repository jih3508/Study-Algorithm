fomular = input()
stack = []
postfix = []
for f in fomular:
    if f in ('+', '-'):
        while stack and stack[-1] != '(':
            postfix.append(stack.pop())
        stack.append(f)
    elif f in ('*', '/'):
        while stack and stack[-1] in ('*', '/'):
            postfix.append(stack.pop())
        stack.append(f)
    elif f == '(':
        stack.append(f)
    elif f == ')':
        while stack and stack[-1] != '(':
            postfix.append(stack.pop())
        stack.pop()
    else:
        postfix.append(f)

while stack and stack[-1] != '(':
    postfix.append(stack.pop())

print(''.join(postfix))