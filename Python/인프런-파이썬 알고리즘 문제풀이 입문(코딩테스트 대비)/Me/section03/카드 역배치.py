card = list(range(21))

for _ in range(10):
    ai , bi = map(int, input().split())
    card[ai : bi + 1] = card[ai : bi + 1][::-1]
    
print(' '.join(map(str, card[1:])))