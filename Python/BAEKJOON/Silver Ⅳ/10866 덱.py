import sys

n = int(sys.stdin.readline())
arr = []
for _ in range(n):
    command = sys.stdin.readline().split()
    if command[0] == 'push_front': arr.insert(0, int(command[1]))
    elif command[0] == 'push_back': arr.append(int(command[1]))
    elif command[0] == 'pop_front': print(arr.pop(0) if arr else -1)
    elif command[0] == 'pop_back': print(arr.pop() if arr else -1)
    elif command[0] == 'size': print(len(arr))
    elif command[0] == 'empty': print(0 if arr else 1)
    elif command[0] == 'front': print(arr[0] if arr else -1)
    elif command[0] == 'back': print(arr[-1] if arr else -1)