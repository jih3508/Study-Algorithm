function solution(k, d) {
    let count = 0;

    // x좌표는 0, k, 2k, 3k, ... 형태로만 가능 (x = a*k)
    // x가 d보다 커지면 원 밖으로 나가므로 range는 d까지만
    for(let num = 0; num <= d; num+=k){
        // x좌표가 주어졌을 때, 원(반지름 d) 안에 들어가는
        // y의 최대값은 피타고라스 정리로 sqrt(d^2 - x^2)
        // y좌표도 0, k, 2k, ... 형태로만 가능 (y = b*k)
        // k로 나눈 몫이 가능한 b의 최댓값
        // b는 0부터 시작하므로 +1 하면 이 x에서 찍을 수 있는 점의 개수
        count += Math.floor(Math.sqrt(d*d - num*num) / k) + 1;
    }
    return count;
}

console.log(solution(2, 6));
console.log(solution(1, 5));