array = []
while 1:
    try:
        array.append(int(input()))
    except EOFError:
        break
array.sort()
print(array[len(array) // 2])