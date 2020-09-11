# "�������� ��ȣ ���ڿ�"�� �ε��� ��ȯ
def balanced_index(p):
    count = 0 #���� ��ȣ�� ����
    for i in range(len(p)):
        if p[i] == '(':
            count +=1
        else: 
            count -= 1
        if count == 0:
            return i

# "�ùٸ� ��ȣ ���ڿ�"���� �Ǵ�
def check_proper(p):
    count = 0 # ���� ��ȣ�� ����
    for i in p:
        if i == "(":
            count +=1
        else:
            if count == 0: # ���� �� ������
                return False
            count -= 1
    return True

def solution(p):
    answer = ''
    if p =='':
        return answer
    index = balanced_index(p)
    u = p[:index+1]
    v = p[index+1:]
    # "�ùٸ� ��ȣ ���ڿ�"�̸�, v�� ���� ������ ����� �ٿ� ��ȯ
    if check_proper(u):
        answer = u + solution(v)
    # "�ùٸ� ��ȣ ���ڿ�"�� �ƴ϶�� �Ʒ��� ������ ����    
    else:
        print(answer)
        answer = '('
        answer += solution(v)
        answer += ')'
        u = list(u[1:-1]) # ù ��°�� ������ ���ڸ� ����
        for i in range(len(u)):
            if u[i] == '(':
                u[i] = ')'
            else:
                u[i] = '('
        answer += "".join(u)
    return answer

print(solution("()))((()"))