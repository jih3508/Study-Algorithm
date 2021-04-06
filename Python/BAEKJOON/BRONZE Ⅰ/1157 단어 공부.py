from collections import Counter
text = list(input().upper()) # 대문자로 리스트 만든다.
char = Counter(text) # 개수를 딕셔너리으로 해준다.
count = list(char.values())
char = list(char.keys())
if count.count(max(count)) > 1: print('?') # 갯수가 가장 많이 것이 2개 이상일때
else: print(char[count.index(max(count))]) # 갯수가 가장 많은것 출