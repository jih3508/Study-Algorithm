result = set(list(range(1, 10000)))
for i in range(1, 10000):
    result -= {eval("+".join(str(i))) + i}
for i in sorted(list(result)):
    print(i)