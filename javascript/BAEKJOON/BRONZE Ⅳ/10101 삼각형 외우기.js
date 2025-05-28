var input = require('fs').readFileSync(__dirname+'/test.txt').toString().split('\n');
//var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const A = parseInt(input[0]);
const B = parseInt(input[1]);
const C = parseInt(input[2]);

if (A == 60 && B == 60 && C == 60) {
    console.log("Equilateral");
} else if ((A + B + C == 180) && ((A == B) ||  (A == C) || (B == C))) {
    console.log("Isosceles");
} else if ((A + B + C == 180)) {
    console.log("Scalene");
}else{
    console.log("Error");
}