var input = require('fs').readFileSync(__dirname+'/test.txt').toString().split('\n');
//var input = require('fs').readFileSync('/dev/stdin').toString().toString().split('\n');

let strings = []
strings.push([]);

// 5줄의 입력을 처리
for (let i = 0; i < 5; i++) {
    const line = input[i];  // i번째 줄 읽기

    // 각 줄의 문자를 세로로 저장
    for (let j = 0; j < line.length; j++) {
        // 필요한 경우 새로운 열(배열) 추가
        if(strings.length < (j + 1)){
            strings.push([]);
        }
        // j번째 열에 현재 문자 추가
        strings[j].push(line[j])
    }
}

let result = ""           // 결과 문자열을 저장할 변수 초기화

// 모든 열(세로로 읽은 문자들)을 순서대로 연결
for (let i = 0; i < strings.length; i++) {
    // 각 열의 문자들을 공백 없이 연결하여 결과 문자열에 추가
    result += strings[i].join("");
}
console.log(result);