import sys
input = sys.stdin.readline

for i in range(1, int(input())+1):
    a, b = map(int, input().split())
    print("Case #" + str(i) + ": " + str(a) + " + " + str(b) + " = " + str(a+b))