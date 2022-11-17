#숫자 검사
#0 ~ 9까지의 문자로 된 숫자를 입력 받았을 때,
#이 입력 값이 0 ~ 9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 만들어라.
#Input
#한 줄에 0 ~ 9까지의 문자로 된 숫자 10개가 띄우지 않고 입력됩니다.
#Output
#0 ~ 9까지의 숫자가 각각 한 번 씩만 사용되었으면 'True', 아니면 'False'를 출력하세요.

#Input: 6789301245     01232457896
#Output:True           False
def numbering(num):
    return len(set(num)) == len(num) # 전체 길이와 set함수 같으면 TRUE

text=input()
print(numbering(text))