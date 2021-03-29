n = int(input())
words = set({})
for _ in range(n):
    words.add(input())
words = sorted(list(words), key= lambda word: (len(word), word))
for word in words:
    print(word)