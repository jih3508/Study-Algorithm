var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").toString().trim().split("\n");

const n = parseInt(input[0]);

// 현재 회사에 있는 사람들의 이름을 저장할 Set
const names = new Set();

// n개의 로그를 처리
for (let i = 1; i <= n; i++) {
    // 각 로그를 공백으로 분리하여 이름과 상태를 파싱
    const [name, action] = input[i].trim().split(' ');

    // "enter"면 사람을 회사에 추가, "leave"면 회사에서 제거
    if (action === "enter") {

        names.add(name);
    } else {
        names.delete(name);
    }
}

// 현재 회사에 있는 사람들을 배열로 변환 후
// 사전순 역순으로 정렬하여 출력
Array.from(names)
    .sort()                // 사전순 정렬
    .reverse()            // 역순으로 뒤집기
    .forEach(name => console.log(name));