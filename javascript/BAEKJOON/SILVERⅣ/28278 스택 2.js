var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

const N = parseInt(input[0]);

let stack = []; // 스택 초기화

let log = [] // 결과 출력

for (let i = 1; i <= N; i++) {
    const line = input[i].replace("\r","").split(' ');
    switch (line[0]) {
        // 정수 X를 스택에 넣는다.
        case '1':
            stack.push(parseInt(line[1]));
            break;
        // 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
        case '2':
            log.push(stack.length === 0? -1 : stack.pop());
            break;
        // 스택에 들어있는 정수의 개수를 출력한다
        case '3':
            log.push(stack.length);
            break;
        // 스택이 비어있으면 1, 아니면 0을 출력한다.
        case '4':
            log.push(stack.length === 0? 1: 0);
            break;
        // 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
        case '5':
            log.push(stack.length === 0? -1: stack[stack.length - 1]);
            break;

    }
}

console.log(log.join('\n'));