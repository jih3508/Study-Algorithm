h, m = map(int, input().split())
t = (h * 60 + m - 45)%(60 * 24)
print(t//60,  t % 60)