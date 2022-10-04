from math import factorial

for _ in range(int(input())):
    east, west =  map(int, input().split())
    print(factorial(west) // (factorial(west-east) * factorial(east)))