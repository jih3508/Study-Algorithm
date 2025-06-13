lengths = sorted(list(map(int, input().split())))

if lengths[0] + lengths[1] > lengths[2]:
    print(lengths[0] + lengths[1] + lengths[2])
else:
    print((lengths[0] + lengths[1]) * 2 - 1)