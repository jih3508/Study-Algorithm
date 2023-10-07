string = input()
number = ''
#숫자추출
for char in string:
    if char.isdigit():
        number += char

number = int(number)
count = 0
# 약수개수
for i in range(1, number + 1):
    count += number % i == 0

print(number)
print(count)

#kdk1k0kdjfkj0kkdjkfj0fkd
#1000