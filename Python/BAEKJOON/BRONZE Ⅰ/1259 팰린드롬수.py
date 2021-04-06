msg = ['no','yes']
while 1:
    number = input()
    if number == '0': break
    print(msg[number == number[::-1]])