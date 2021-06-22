word = input()
count = 0
for char in word:
    if char in 'ABC': count+= 3
    elif char in 'DEF': count+= 4
    elif char in 'GHI': count+= 5
    elif char in 'JKL': count+= 6
    elif char in 'MNO': count += 7
    elif char in 'PQRS': count += 8
    elif char in 'TUV': count += 9
    elif char in 'WXYZ': count += 10
print(count)