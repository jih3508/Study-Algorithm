count = 0
while(True):
    try:
        input()
        count += 1
    except EOFError:
        break
print(count)