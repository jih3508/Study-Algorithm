var input = require('fs').readFileSync(__dirname+'/test.txt').toString().split('\n');
//var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

for(let i = 0; i < parseInt(input[0]); i++) {
    let result = 1;

    const N = parseInt(input[i + 1])

    for (let num = 2; num <= N; num++) {
        result *= num;
    }

    console.log(result % 10);
}