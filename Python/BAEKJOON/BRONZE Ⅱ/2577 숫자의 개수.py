a = int(input())
b = int(input())
c = int(input())
abc = str(a*b*c)
for i in range(10):
    print(abc.count(str(i)))