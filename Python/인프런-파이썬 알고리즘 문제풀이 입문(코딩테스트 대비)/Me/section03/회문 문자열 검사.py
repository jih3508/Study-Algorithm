for i in range(1, int(input()) + 1):
    word = input().lower()
    print("#{0} {1}".format(i, 'YES' if word == word[::-1] else 'NO'))    
