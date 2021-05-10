import sys

def operator(i, s=''):
    if i == n:
        s += str(i)
        if eval(''.join(s.split(' '))) == 0:
            formula.append(s)
        return
    for op in ['+','-',' ']:
        operator(i+1,s + str(i) + op)
        
test_case = int(sys.stdin.readline())
for index in range(test_case):
    n = int(sys.stdin.readline())
    formula = []
    operator(1)
    for s in sorted(formula):
        print(s)
    if index != test_case-1: print()