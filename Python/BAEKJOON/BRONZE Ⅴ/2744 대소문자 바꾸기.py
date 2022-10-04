string = input()
result = ""
for char in string:
    result += char.upper() if char.islower() else char.lower()
    
print(result)