while 1:
    s = input()
    if s == '.': break
    stack = []
    flag = 1
    for char in s:
        if char == '(' or char == '[':
            stack.append(char)
        elif char == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                flag = 0
                break
        elif char == ']':
            if stack and stack[-1] == '[':
                stack.pop()
            else:
                flag = 0
                break
    print(('no', 'yes')[flag and not stack])