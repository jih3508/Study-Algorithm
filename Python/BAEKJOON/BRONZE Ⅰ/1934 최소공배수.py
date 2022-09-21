import sys
input = sys.stdin.readline

def Euclid(x, y):
    if x % y == 0:
        return y
    return Euclid(y, x % y)

for _ in range(int(input())):
    A, B = map(int, input().split())
    print(A * B // Euclid(A, B))