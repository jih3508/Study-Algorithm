import sys
input = sys.stdin.readline

for i in range(1,int(input())+1):
    print("Case #" + str(i) + ":", sum(map(int, input().split())))