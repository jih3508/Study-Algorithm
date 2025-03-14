/*
 * 문제: 이빈 변환 반복하기
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */
function solution(s) {

    let answer = [0, 0] //이진 변환 횟수, 0이 제거 된 횟수/

    while (s !== "1") {
        answer[0]++; // 변환 회수 추가

        let after = s;
        after = after.replaceAll("0", ""); // 전체 0 제거
        answer[1] += s.length - after.length; // 기존 길이와 0을 뺀 길이와 비교 해서 추가 한다.
        s = after.length.toString(2); // 문자 길이를 2진수로 변환
    }

    return answer;
}

console.log(solution("110010101001"));
console.log(solution("01110"));
console.log(solution("1111111"));