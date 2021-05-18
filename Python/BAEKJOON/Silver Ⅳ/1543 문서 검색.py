string = input()
word = input()
count, i = 0, 0
while i <= len(string) - len(word):
    if string[i:i+len(word)] == word:
        count += 1
        i += len(word)
    else: i += 1
print(count)