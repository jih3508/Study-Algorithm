m, index = 0, 0
for i in range(1,10):
    n = int(input())
    if n > m: m, index = n, i
print("{}\n{}".format(m,index))