while True:
    A, B, C = map(int, input().split())
    max_length = max(A, B, C)
    is_invalid = (A + B + C) - max_length <= max_length

    if A == 0 and B == 0 and C == 0:
        break
    elif A == B and A == C and B == C:
        print("Equilateral")
    elif not is_invalid and (A== B or A == C or B == C):
        print("Isosceles")
    elif not is_invalid:
        print("Scalene")
    else:
        print("Invalid")
