string = input()
explore_string = input()
lenth = len(explore_string)
while string.count(explore_string):
    stack = []
    for s in string:
        stack.append(s)
        if len(s) <= len(explore_string) and ''.join(stack[-lenth:]) == explore_string:
            for _ in range(lenth):
                stack.pop()
    string = ''.join(stack)
print(string if string else "FRULA")