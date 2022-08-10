A, B = map(int, input().split())
C = int(input())
h, m = divmod(B + C, 60)
h = (A + h) % 24
print(h, m)