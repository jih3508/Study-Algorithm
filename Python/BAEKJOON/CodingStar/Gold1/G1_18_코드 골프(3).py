r = range(-5,6) #���Ͽ� �¿� ��Ī
for i in r:
    s = ''
    for j in r:
        x, y = abs(i), abs(j)
        s += ' *'[(x + y) == 4 or (5, 0) in [(x,y), (y,x)]] 
    print(s)
# (5, 0) in [(x,y), (y,x)] : ������ �κ�