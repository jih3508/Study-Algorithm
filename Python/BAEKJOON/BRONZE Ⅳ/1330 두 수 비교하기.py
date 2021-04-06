a ,b = map(int, input().split())
print("==" if a == b else ('>','<')[a<b])