vowel = { 'a', 'e', 'i', 'o', 'u'} 
while True:
    count = 0
    sentence = input().lower()
    if(sentence == "#"): break
    for char in sentence:
        count += char in vowel
    print(count)