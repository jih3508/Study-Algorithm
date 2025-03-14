def solution(s):
    answer = [0, 0] # 이진 변환 횟수, 0이 제거 된 횟수

    while(s != "1"):
        answer[0] += 1

        after = s.replace("0", "") # 문자 0을 제거
        answer[1] += len(s) - len(after) # 기존 문자열과 0을 제거 차이 추가하기
        s = bin(len(after))[2:] # 문자 길이를 이진수로 변환후 저저아

    return answer

print(solution("110010101001"))
print(solution("01110"))
print(solution("1111111"))