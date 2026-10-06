class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for bracket in s:
            # 여는 괄호는 스택에 담는다
            if bracket == '(' or bracket == '{' or bracket == '[':
                stack.append(bracket)
            else:
                # 닫는 괄호인데 스택이 비어 있으면 실패
                if len(stack) == 0:
                    return False

                top = stack.pop()
                # 맨 위 여는 괄호와 짝이 맞지 않으면 실패
                if ((bracket == ")" and top != "(")
                        or (bracket == "}" and top != "{")
                        or (bracket == "]" and top != "[")):
                    return False

        # 전체 순환했을때 stack 비어있으면 맞는 괄호 남았으면 잘못된 괄호 표기이다.
        return True



solution = Solution()
print(solution.isValid("()"))
print(solution.isValid("()[]{}"))
print(solution.isValid("(]"))
print(solution.isValid("([])"))
print(solution.isValid("([)]"))
