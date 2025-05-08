def GCD(x, y):
    while x % y != 0:
        r = x % y
        x, y = y, r
    return y

def LCM(x, y):
    return x * y // GCD(x, y)

A, B = map(int, input().split())
print(LCM(A, B))