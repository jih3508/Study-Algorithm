code = [9, 7, 8, 0, 9, 2, 1, 4, 1, 8]
code.extend([int(input()) for _ in range(3)])
s = 0
for i in range(len(code)):
    s += code[i] * (1, 3)[i % 2]
    
print("The 1-3-sum is", s)