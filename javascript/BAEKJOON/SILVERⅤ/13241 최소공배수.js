var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split(" ");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").toString().trim().split(" ");

const GCD = (x, y) =>{
    let r;
    while(x % y != 0){

        r = x % y;
        x = y;
        y = r;
    }
    return y;
}

const LCM = (x, y) =>{
    return x * y / GCD(x, y);
}

const [A, B] = input.map(x => parseInt(x));
console.log(LCM(A, B));