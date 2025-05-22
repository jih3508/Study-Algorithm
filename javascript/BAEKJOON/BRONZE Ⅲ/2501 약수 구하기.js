var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim();
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim();

const [N, K] = input.split(' ').map(Number);
let divisors = Array();
for (let i = 1; i <= N; i++) {
    if(N % i === 0){
        divisors.push(i);
    }
}

console.log(divisors.length >= K ? divisors[K - 1] : 0);

