#영문자, 숫자, 기호로 이루어진 문자열(string)을 입력 받아서,
#모든 짝수 번째 숫자를 ‘%’로 치환하여 보세요.
def change(x):
    for i in range(1,len(x),2):
        if x[i].isdigit(): x[i] = '%'
    return ''.join(x)

text=input()
print(change(list(text)))
