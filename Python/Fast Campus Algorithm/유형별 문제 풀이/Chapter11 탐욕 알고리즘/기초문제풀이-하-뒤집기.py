'''
 문자열에 있는 숫자를 모두 0 혹은 모두 1로 만들어야 한다.
 다음 두 가지 경우를 모두 계산하면 된다.
 문자열 S의 길이는 100만 이하이므로, 시간 복잡도는 O(N)에 해결해야 한다.
 구체적인 알고리즘 예시) 모두 1로 만드는 경우
 첫 번째 원소가 0인 경우
 2개씩 원소를 비교할 때, 1에서 0으로 바뀌는 경우
'''

data = input()
count0 = 0 #전부 0으로 바꾸는 경우
count1 = 0 #전부 1로 바꾸는 경우
if data[0] == '1':
    count0 += 1
else:
    count1 += 1

for i in range(len(data) - 1):
    if data[i] != data[i + 1]:
        # 다음 수에서 1로 바뀌는 경우
        if data[i + 1] == '1':
            count0 += 1
        # 다음 수에서 0으로 바뀌는 경우
        else:
            count1 += 1

print(min(count0, count1))