number = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
N, B = map(int, input().split())
s = ""

while N:
    s += number[N % B]
    N //= B

print(s[::-1])