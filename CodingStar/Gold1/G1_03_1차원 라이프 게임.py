def life(line, n):
    for _ in range(n):
        line = line[-1] + line + line[0] # 앞에 n-1번 뒤에 0번을 보조를 세워서 구한다.
        new = ''
        for i in range(1,len(line)-1): #라인에 대한 조사한다.
            # 111 → 1 , 101 → 0, 100 → 1, 001 → 1 2로 나누면 생존 여부 확인 가능함 
            new += str(sum([int(j) for j in line[i-1:i+2]])%2) #3개 더해서 2로 나눈다.
        line = new
    return line

string, n = input().split()
print(life(string, int(n)))