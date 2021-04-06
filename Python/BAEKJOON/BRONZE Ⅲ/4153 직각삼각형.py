while(True):
    A, B, C = map(int , input().split())
    if A == 0 and B == 0 and C == 0: break
    else: 
        if C < A: A, C = C, A
        if C < B: C, B = B, C
        print(('wrong','right')[C**2 == A**2 + B**2])