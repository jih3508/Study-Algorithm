# 단어와 숫자 설정한다.
key = {
'zero' : 0, 'one' : 1, 'two' : 2, 'three' : 3, 'four' : 4 , 
'five' : 5, 'six' : 6, 'seven' : 7, 'eight' : 8, 'nine' : 9
}

def solution(s):
    answer = 0
    number = '' # 단어 변수
    # 문자하나씩 가져온다.
    for char in s:     
        number += char
    
        # 완성된 단어나 숫자인경우 뒤에 붙이고 number 변수 초기화 한다.
        if number.isdigit():
            answer = answer *10 + int(number)
            number = ''
        elif number in key.keys():
            answer = answer *10 +key[number]
            number = ''
        
    return answer