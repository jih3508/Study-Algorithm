a1, a2 = map(int, input().split())
c =int(input())
n0 =int(input())

print(1 if (a1 * n0 + a2 <= c * n0) and a1 <= c else 0)