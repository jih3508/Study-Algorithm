a, b, c = map(int, input().split())

dice = {i : 0 for i in range(1, 7)}
dice[a] += 1
dice[b] += 1
dice[c] += 1
result = 0

for num, count in dice.items():
    hap = 0
    if count == 3:
        result = 10000 + num * 1000
        break
    elif count == 2:
        hap = 1000 + num * 100
    elif count == 1:
        hap = num * 100
    
    result = hap if hap > result else result

print(result)    