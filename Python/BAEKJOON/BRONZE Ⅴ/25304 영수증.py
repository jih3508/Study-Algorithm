X = int(input())
for _ in range(int(input())):
    a, b = map(int, input().split())
    X -= a * b
print("Yes" if X == 0 else "No")