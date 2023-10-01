import sys
sys.stdin=open("./Me/section05/input.txt", "r")

formula = input()
stack = []
postfix = ''

for i in range(len(formula)):
    if formula[i].isdigit():
        postfix += formula[i]
    else:
        if formula[i] == '+' or formula[i] == '-':
            while stack and (stack[-1] != '('):
                postfix += stack.pop()
            stack.append(formula[i])
        elif formula[i] == '*' or formula[i] == '/':
            while stack and (stack[-1] == '*' or stack[-1] == '/'):
                postfix += stack.pop()   
            stack.append(formula[i])         
        elif formula[i] == ')':
            while stack and stack[-1] != '(':
                postfix += stack.pop()
            stack.pop()
        elif formula[i] == '(':
            stack.append(formula[i])
    print(postfix, stack)

while stack:
    postfix += stack.pop()

print(postfix)
        

'''
3+5*2/(7-2)
3 +
35  +*
352 +*/
352 +*/(
3527 +*/(-
35272 +*/(-)
352*72-/+
'''