/*
 * 개인정보 수집 유효기간
 * https://school.programmers.co.kr/learn/courses/30/lessons/150370
 */
function solution(today, terms, privacies) {
    /*
     * 일자를 일자로 변환
     * year * 12 * 28 + month * 28 + day
     */
    const dateToDays = (date) => {
        [year, month, day] = date.split(".");

        return (Number(year) * 12 * 28) + (Number(month) * 28) + Number(day);
    };

    // 약관 정보 저장
    let termInfo = new Map();
    terms.forEach((termData) => {
        [term, month] = termData.split(' ');
        termInfo.set(term, Number(month))
    })

    // 오늘 날짜를 일수로 변환
    const todayToDay = dateToDays(today)

    let answer = [];
    privacies.forEach((privacy, idx) => {
        [date, term] = privacy.split(' ');
        // 약관이 오늘까지 이면 answer에 추가
        if(todayToDay >=  dateToDays(date) +  termInfo.get(term) * 28 ){
            answer.push(idx + 1);
        }
    })

    return answer;
}

let today = "2022.05.19"
let terms = ["A 6", "B 12", "C 3"]
let privacies = ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
console.log(solution(today, terms, privacies));

today = "2020.01.01";
terms = ["Z 3", "D 5"];
privacies = ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]
console.log(solution(today, terms, privacies))