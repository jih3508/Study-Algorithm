S = input()
count = [0, 0]
count[int(S[0])] = 1
for i in range(1, len(S)):
    count[int(S[i])] += 1 if S[i] != S[i - 1] else 0
print(min(count))