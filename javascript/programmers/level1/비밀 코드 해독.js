/*
 * 비밀 코드 해독
 * https://school.programmers.co.kr/learn/courses/30/lessons/388352
 */
function solution(n, q, ans) {
    var answer = 0;
    const size = ans.length;

    const recursive = (index, arr) => {
        // 비밀코드 5개 만들었을때
        if (arr.length >= 5){

            let flag = true; // 전체 입력한 정수와 일치한 개수가 맞는지 확인 하는 변수

            for (let i = 0; i < size; i++) {
                let count = 0;
                arr.forEach((num) => {
                    if (q[i].includes(num)){
                        count++;
                    }
                })
                // 비밀 코드하고 q[i]번째와 ans[i]개수와 일치 하지 않않으면 바로 종료
                if (count !== ans[i]){
                    flag = false;
                    break;
                }
            }

            // 전체 탐색 했을때 모두다 일치 했을때
            if(flag){
                answer++;
            }
        }else{
            // 오름 차순으로 이전 저장 한것 +1 부터 해서 n까지 하나씩 집어 넣음
            for (let i = index; i <= n; i++) {
                arr.push(i);
                recursive(i + 1, arr);
                arr.pop();
            }
        }

    }

    recursive(1, []);
    return answer;
}

let n = 10;
let q = [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [3, 7, 8, 9, 10], [2, 5, 7, 9, 10], [3, 4, 5, 6, 7]];
let ans = [2, 3, 4, 3, 3];
console.log(solution(n, q, ans));

n = 15;
q = [[2, 3, 9, 12, 13], [1, 4, 6, 7, 9], [1, 2, 8, 10, 12], [6, 7, 11, 13, 15], [1, 4, 10, 11, 14]];
ans = [2, 1, 3, 0, 1];
console.log(solution(n, q, ans));
