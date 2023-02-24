'''
- C개의 문자들이 주어졌을 때, 가능한 L 길이의 암호를 모두 찾아야 한다.
- 따라서 C개의 문자들 중에서 L개를 선택하는 모든 조합을 고려해야 한다.
    - Python의 조합(combination) 라이브러리를 사용하면 간단히 해결할 수 있다.
    - 혹은 DFS를 이용하여 조합 함수를 구현 할 수 있다.
- C개의 문자들이 주어졌을 때, 가능한 L 길이의 암호를 모두 찾아야 한다.
- 따라서 C개의 문자들 중에서 L개를 선택하는 모든 조합을 고려해야 한다.
'''
import copy
result = []
string = []
visited = []

# 조합 (Combination) 함수 구현
def combination(array, length, index):
    # 길이가 length인 모든 조합 찾기
    if len(string) == length:
        result.append(copy.deepcopy(string))
        return
    # 각 원소를 한 번씩만 뽑도록 구성
    for i in range(index, len(array)):
        if i in visited:
            continue
        string.append(array[i])
        visited.append(i)
        combination(array, length, i + 1)
        string.pop()
        visited.pop()

vowels = ('a', 'e', 'i', 'o', 'u')
l, c = map(int, input().split(' '))

# 가능한 암호를 사전식으로 출력해야 하므로 정렬 수행
array = input().split(' ')
array.sort()

combination(array, l, 0)

# 길이가 1인 모든 암호 조합을 확인
for password in result:
    # 모듬의 개수를 세기
    count = 0
    for i in password:
        if i in vowels:
            count += 1

    # 최소 한 개의 모음과 최소 두 개의 자음이 있는 경우
    if count >= 1 and count <= l - 2:
        print(''.join(password))