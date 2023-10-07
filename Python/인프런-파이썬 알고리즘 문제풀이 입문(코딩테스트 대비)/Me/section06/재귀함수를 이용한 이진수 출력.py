import sys
sys.stdin=open("./Me/section06/input.txt", "r")

def binary_number(num, s = ''):
    if num == 0:
        return s
    return binary_number(num//2, str(num%2) + s)

print(binary_number(int(input())))