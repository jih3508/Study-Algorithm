from itertools import permutations
N, K = map(int, input().split())
cards = list(map(int, input().split()))
result = set({})
for card in permutations(cards, 3):
    result.add(sum(card))
result = sorted(result, reverse=True)
print(result[K-1])