S = input()
result = S[0]
for char in S[1:]:
    if result[-1] != char:
        result += char
print(min(result.count('0'), result.count('1')))