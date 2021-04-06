def uclid(a, b):
    if b == 0: return a
    return uclid(b, a% b)

a, b = map(int, input().split())
gcm = uclid(a, b)
print(gcm)
print(a * b // gcm)