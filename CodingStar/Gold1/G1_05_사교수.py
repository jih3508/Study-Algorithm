def sociable(num): #약수 구하는 함수
    s = 1
    for i in range(2, int(num**(1/2))+1):
        if num%i == 0:
            s += i
            if num//i != i: s += num//i
    return s

n = int(input())
number = n
arr = [] #사교수를 모은다.
while n not in arr: #반복 될때 까지 사교수 구한다. 
    print(number)
    number = sociable(number)
    arr.append(number)