def sociable(num): #��� ���ϴ� �Լ�
    s = 1
    for i in range(2, int(num**(1/2))+1):
        if num%i == 0:
            s += i
            if num//i != i: s += num//i
    return s

n = int(input())
number = n
arr = [] #�米���� ������.
while n not in arr: #�ݺ� �ɶ� ���� �米�� ���Ѵ�. 
    print(number)
    number = sociable(number)
    arr.append(number)