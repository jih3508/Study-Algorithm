n = input()
a, count = n.zfill(2), 0

while 1:
    count += 1
    n = n.zfill(2)
    n = n[1] + str(eval("+".join(n))).zfill(2)[1]
    if n == a: break
    
print(count)