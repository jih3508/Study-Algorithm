def fourSquares(n):
    result = 4
    for x in range(int(n ** (0.5)), int((n // 2) ** (0.5)) - 1, -1):
        a = n - (x * x)
        if (a == 0): return 1
        
        for y in range(int(a ** (0.5)), int((a // 2) ** (0.5)) - 1, -1):
            b  = a - (y * y)
            if(b == 0):
                result = min(result, 2)
                break
            
            for z in range(int(b ** (0.5)), int((b // 2) ** (0.5)) - 1, -1):
                c = b - (z * z)
                if (c == 0):
                    result = min(result, 3)
                    break
    return result
    
print(fourSquares(int(input())))