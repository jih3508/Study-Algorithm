import sys
input = sys.stdin.readline

n = int(input())
count = 0
for _ in range(n):
    word = input()
    flag = 1
    for i in range(len(word)-1):
        if word[i] != word[i+1] and word[i+1:].count(word[i]) > 0:
            flag = 0
            break
    count += flag
print(count)