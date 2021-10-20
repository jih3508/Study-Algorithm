n = int(input())
m = int(input())
buttons = list(map(int, input().split())) if m else []

s = abs(n - 100)
for num in range(0, 1000001):
    nums = [i for i in list(map(int, str(num)))]
    flag = True
    for i in nums:
        if i in buttons:
            flag = False
            break
    if flag:
        s = min(s, abs(num - n) + len(nums))
print(s)