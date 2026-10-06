package Easy;

import java.util.*;

public class ValidParentheses {


    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char bracket : s.toCharArray()){
            // 괄호가 열려있을 경우 stack에 담는다
            if(bracket == '(' || bracket == '{' || bracket == '['){
                stack.push(bracket);
            // 괄호가 닫혀있는 경우 stack을 맨위것랑 비교한다.
            }else{
                // 닫는 괄호는 스택에 비어 있을수 없다.
                if(stack.isEmpty()){
                    return false;
                }
                // 맨위 stack을 뽑는다.
                char top = stack.pop();
                // 맨위 여는 괄호와 일치가 안되면 fasle를 반환한다.
                if((bracket == ')' && top != '(')
                || (bracket == '}' && top != '{')
                || (bracket == ']' && top != '[')){
                    return false;
                }

            }
        }

        // 전체 순환했을때 stack 비어있으면 맞는 괄호 남았으면 잘못된 괄호 표기이다.
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParentheses solution = new ValidParentheses();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([])"));
        System.out.println(solution.isValid("([])"));
        System.out.println(solution.isValid("([)]"));

    }
}
