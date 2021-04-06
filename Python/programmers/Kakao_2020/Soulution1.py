def data(s):
    answer=len(s)
    sentens=s
    # 1개 단위(step)부터 압축 단위를 늘려가며 확인
    for step in range(1,len(s)):
        count=1
        prev=s[:step] #앞에서부터 step 만큼의 문자열 추출
        compressed=''
        #단위(step) 크기만큼 증가시키며 이전 문자열과 비교
        for i in range(step, len(s), step):
            #이전 상태와 동일하다면, 압축 회수(count) 증가
            if prev == s[i:i+step]: count+=1
            #다른 문자열이 나왔다면 (더 이상 압축하지 못하는 경우라면)
            else:
                compressed += str(count) + prev if count > 1 else prev
                prev = s[i:i+step] # 다시 초기화
                count=1
        #남아있는 문자열에 대해서 처리        
        compressed += str(count) + prev if count > 1 else prev
        #만들어지는 압축 문자열이 가장 짧은 것이 정답
        if answer> len(compressed):
            answer = len(compressed)
            sentens = compressed
    return answer, sentens            

s=input()
print("%d %s"%data(s))