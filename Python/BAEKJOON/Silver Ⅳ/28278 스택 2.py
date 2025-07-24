import sys
input = sys.stdin.readline

N = int(input())

stack = [] # 스택 초기화
log = [] # 결과 출력

for _ in range(N):
    line = list(map(int, input().split()))
    match(line[0]):
        # 정수 X를 스택에 넣는다.
        case 1:
            stack.append(line[1])
        # 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
        case 2:
            log.append(-1 if len(stack) == 0 else stack.pop() )
        # 스택에 들어있는 정수의 개수를 출력한다
        case 3:
            log.append(len(stack))
        # 스택이 비어있으면 1, 아니면 0을 출력한다.
        case 4:
            log.append(1 if len(stack) == 0 else 0)
        # 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
        case 5:
            log.append(-1 if len(stack) == 0 else stack[-1])


print("\n".join(map(str, log)))