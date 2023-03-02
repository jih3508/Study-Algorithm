import sys

def make_inequality(depth, number):
    global max_value, min_value
    if depth == N:
        if int(number) > int(max_value):
            max_value = number
        if int(number) < int(min_value):
            min_value = number
        return
    
    for i in range(10):
        if (visited[i] == False and ((inequality[depth] == "<" and int(number[depth]) < i ) or 
                                     (inequality[depth] == ">" and int(number[depth]) > i ))):
            visited[i] = True
            make_inequality(depth + 1, number + str(i))
            visited[i] = False

max_value = str(0)
min_value = str(10 ** 11)
N = int(input())
inequality = input().split()
visited = [False] * 10
for i in range(10):
    visited[i] = True
    make_inequality(0, str(i))
    visited[i] = False

print(max_value)
print(min_value)