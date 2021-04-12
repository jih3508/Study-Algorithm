import sys

arr = []
n = int(sys.stdin.readline())
for _ in range(n):
    command = list(sys.stdin.readline().split())
    if command[0] == 'push': arr.append(int(command[1]))
    elif command[0] == 'pop': print(arr.pop() if arr else -1)
    elif command[0] == 'size': print(len(arr))
    elif command[0] == 'empty': print(0 if arr else 1)
    elif command[0] == 'top': print(arr[-1] if arr else -1)    