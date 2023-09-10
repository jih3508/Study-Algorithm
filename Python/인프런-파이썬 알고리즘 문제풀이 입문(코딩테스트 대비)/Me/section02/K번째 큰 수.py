from itertools import combinations

N, K = map(int, input().split())
cards = list(map(int, input().split()))
result = set({})
for card in combinations(cards, 3):
    print(card)
    result.add(sum(card))
result = sorted(result, reverse=True)
print(result[K-1])