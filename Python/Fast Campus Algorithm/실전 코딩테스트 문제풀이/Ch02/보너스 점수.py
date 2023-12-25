N, S = input(), input()

score, bonus = 0, 0

for idx, OX in enumerate(S):
    if OX == 'O':
        score , bonus = score + idx + 1 + bonus, bonus + 1
    else:
        bonus = 0
    
print(score)
