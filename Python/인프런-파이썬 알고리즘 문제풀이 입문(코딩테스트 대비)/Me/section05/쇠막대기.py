import sys
sys.stdin=open("./Me/section05/input.txt", "r")

stick = input()
stack = []
cnt = 0

for i in range(len(stick)):
    if stick[i] == '(':
        stack.append(stick[i])
    else:
        stack.pop()
        if  stick[i - 1] == '(':
            cnt += len(stack)
        else:
            cnt += 1

print(cnt)