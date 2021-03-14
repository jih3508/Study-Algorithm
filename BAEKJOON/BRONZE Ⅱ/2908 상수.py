a, b = map(lambda x: x[::-1],input().split())
print(a if int(a) > int(b) else b)