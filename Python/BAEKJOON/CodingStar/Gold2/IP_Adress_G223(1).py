#�Ϲ� ���� ���
def coding(IP):
    byte=''.join([(bin(i)[2:]).zfill(8) for i in IP])# 8�ڸ��� ����ִ� �ڸ��� �տ� 0���� ä���� ����
    return int(byte, 2)

IPv4=input()
print(coding(map(int,IPv4.split('.'))))
#zfill(x): ���� x������ŭ ���ڿ��� ������ x���� ���ڶ���ŭ �տ� 0���� ä�� 