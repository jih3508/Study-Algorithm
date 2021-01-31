from math import sqrt
def reg(n):
    triangle = [] # 삼각형 길이 저장하는 리스트
    for a in range(1,n//2+1): # 한변의 길이 반이하로 설정한다.
        for b in range(a, n//2+1): # b는 a보다 크게해서 for문 돌리는 횟수 줄인다.
            c = sqrt(a**2 + b**2) # 빗변길이
            if a + b + c > n: break  # 삼각형 둘레만 넘으면 다 pass한다.
            elif c%1 == 0: triangle.append(int(a+b+c)) #빗변길이가 정수이면 리스트에 저장한다.
    m = max(triangle, key=triangle.count) #횟수가 가장많고 그중 가장 큰 길이 수한다.
    return m, triangle.count(m)   

n = int(input())
print("%d %d"%reg(n))
