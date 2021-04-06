import sys

for data in sys.stdin:
    print(sum(map(int, data.split())))