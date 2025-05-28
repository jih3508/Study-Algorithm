A = int(input())
B = int(input())
C = int(input())

if A == 60 and B == 60 and C == 60:
    print("Equilateral")
elif (A + B + C) == 180 and (A == B or A == C or B == C):
    print("Isosceles")
elif (A + B + C) == 180:
    print("Scalene")
else:
    print("Error")