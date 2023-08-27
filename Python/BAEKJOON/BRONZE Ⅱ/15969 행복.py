import sys
input = sys.stdin.readline

N = int(input())
grade = list(map(int, input().split()))
print(max(grade) - min(grade))