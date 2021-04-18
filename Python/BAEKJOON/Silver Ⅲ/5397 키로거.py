n = int(input())

for _ in range(n):
    left = []
    right = []
    string = input()
    for char in string:
        if char == '<':
            if left: right.append(left.pop())
        elif char == '>':
            if right: left.append(right.pop())
        elif char == '-' :
            if left: left.pop()
        else:
            left.append(char)
    print(''.join(left+right[::-1]))