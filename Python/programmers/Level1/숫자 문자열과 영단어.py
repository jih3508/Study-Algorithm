# �ܾ�� ���� �����Ѵ�.
key = {
'zero' : 0, 'one' : 1, 'two' : 2, 'three' : 3, 'four' : 4 , 
'five' : 5, 'six' : 6, 'seven' : 7, 'eight' : 8, 'nine' : 9
}

def solution(s):
    answer = 0
    number = '' # �ܾ� ����
    # �����ϳ��� �����´�.
    for char in s:     
        number += char
    
        # �ϼ��� �ܾ �����ΰ�� �ڿ� ���̰� number ���� �ʱ�ȭ �Ѵ�.
        if number.isdigit():
            answer = answer *10 + int(number)
            number = ''
        elif number in key.keys():
            answer = answer *10 +key[number]
            number = ''
        
    return answer