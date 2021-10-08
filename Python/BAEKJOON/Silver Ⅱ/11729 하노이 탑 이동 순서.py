def hanoi_top(n, a, b, c):
    if(n == 1): 
        move.append([a,c])
        return
    hanoi_top(n-1, a, c, b)
    move.append([a, c])
    hanoi_top(n-1, b, a, c)
    
move = []
hanoi_top(int(input()), 1, 2, 3)
print(len(move))
for x, y in move: print(x, y)