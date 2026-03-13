var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

const C = parseInt(input[0]);
for(let i = 0; i < C; i++){
    const N = parseInt(input[i+1]);

    let result = 0;
    for(let num = 1; num <= Math.sqrt(N); num++) {
        if(N % num === 0){
            result += num !== N / num? 2 : 1;
        }
    }

    console.log(`${N} ${result}`);
}