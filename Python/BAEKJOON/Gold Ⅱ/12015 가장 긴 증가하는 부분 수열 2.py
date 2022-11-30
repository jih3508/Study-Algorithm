import bisect
N = int(input())
array = list(map(int, input().split()))

#처음에 맨 뒤에 값이랑 비교하기위해서 수열 부분에 첫번째 인덱스 값이 옴
sequense = [array[0]]
for num in array[1:]:
    if sequense[-1] < num:
        sequense.append(num)
    else:
        sequense[bisect.bisect_left(sequense, num)] = num

print(len(sequense))