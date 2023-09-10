string = input()
number = ''
for char in string:
    if char.isdigit():
        number += char

number = int(number)
count = 0
for i in range(1, number + 1):
    count += number % i == 0

print(number)
print(count)
