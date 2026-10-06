var isValid = function(s) {
    const stack = [];

    for (const bracket of s) {
        // 여는 괄호는 스택에 담는다
        if (bracket === "(" || bracket === "{" || bracket === "[") {
            stack.push(bracket);
        } else {
            // 닫는 괄호인데 스택이 비어 있으면 실패
            if (stack.length === 0) {
                return false;
            }

            const top = stack.pop();

            // 맨 위 여는 괄호와 짝이 맞지 않으면 실패
            if((bracket === ")" && top !== "(")
              || (bracket === "}" && top !== "{")
              || (bracket === "]" && top !== "[")){
                return  false;
            }
        }
    }

    // 전체 순환했을때 stack 비어있으면 맞는 괄호 남았으면 잘못된 괄호 표기이다.
    return stack.length === 0;
};

console.log(isValid("()"))
console.log(isValid("()[]{}"))
console.log(isValid("(]"))
console.log(isValid("([])"))
console.log(isValid("([)]"))
