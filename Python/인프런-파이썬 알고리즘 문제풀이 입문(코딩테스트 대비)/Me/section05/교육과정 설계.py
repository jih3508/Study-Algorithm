import sys
from collections import deque
sys.stdin=open("./Me/section05/input.txt", "r")

require = input()
for t in range(int(input())):
    lessons = input()
    need = deque(list(require))
    flag = True
    for lesson in lessons:
        if lesson in need:
            if lesson != need.popleft():
                flag = False
                break
    flag = flag and len(need) == 0
    print("#%d %s"%((t+1,'YES' if flag else 'NO' )))



'''
CBDAGE  CBA
CBD    
'''