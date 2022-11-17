r = range(-5,6) #상하와 좌우 대칭
for i in r:
    s = ''
    for j in r:
        x, y = abs(i), abs(j)
        s += ' *'[(x + y) == 4 or (5, 0) in [(x,y), (y,x)]] 
    print(s)
# (5, 0) in [(x,y), (y,x)] : 마름보 부분