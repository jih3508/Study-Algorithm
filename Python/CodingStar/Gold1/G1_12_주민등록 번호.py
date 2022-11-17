def check(number):
    check_num = [2,3,4,5,6,7,8,9,2,3,4,5] # 가중치
    weight = sum([number[i] * check_num[i] for i in range(12)]) # 가중치 합
    return (11-weight%11)%10 == number[-1]

n = int(input())
for _ in range(n):
    num1, num2 = input().split('-')
    print(check(list(map(int,num1+num2))))