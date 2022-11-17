#일반 적인 방법
def coding(IP):
    byte=''.join([(bin(i)[2:]).zfill(8) for i in IP])# 8자리중 비어있는 자리는 앞에 0으로 채워서 합함
    return int(byte, 2)

IPv4=input()
print(coding(map(int,IPv4.split('.'))))
#zfill(x): 만약 x개수만큼 문자열이 없으면 x개수 모자란만큼 앞에 0으로 채움 