#lambda »ç¿ë
a= lambda x: (bin(x)[2:]).zfill(8)
IPv4=input()
byte=''.join([a(i) for i in map(int, IPv4.split('.'))])
print(int(byte, 2))
