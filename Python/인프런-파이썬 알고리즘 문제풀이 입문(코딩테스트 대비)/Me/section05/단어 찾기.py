import sys
sys.stdin=open("./Me/section05/input.txt", "r")

N = int(input())
words = {input() : 1 for _ in range(N)}
words1 = [input() for _ in range(N-1)]

for word in words1:
    words[word] = 0

for word, value in words.items():
    if value:
        print(word)
        break