n = int(input())
result = 1
for i in range(2, n+1):
    if i < 100: result += 1
    else:
        nums = list(map(int, str(i)))
        result += (nums[0] - nums[1]) == (nums[1] - nums[2])
print(result)