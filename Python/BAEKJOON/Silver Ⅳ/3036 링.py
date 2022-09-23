import math

size = int(input())
numbers = list(map(int, input().split()))

basic_number = numbers[0]
for number in numbers[1:]:
    gcd = math.gcd(basic_number, number)
    print(str(basic_number // gcd) + "/" + str(number // gcd))