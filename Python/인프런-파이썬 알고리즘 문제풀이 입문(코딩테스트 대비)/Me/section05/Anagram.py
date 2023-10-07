import sys
sys.stdin=open("./Me/section05/input.txt", "r")

word1 = input().lower()
word2 = input().lower()

counts = [0] * 26

for s in word1:
    counts[ord(s) - ord('a')] += 1

for s in word2:
    counts[ord(s) - ord('a')] -= 1

flag = True
for count in counts:
    if count != 0:
        flag = False
        break

print('YES' if flag else 'NO')