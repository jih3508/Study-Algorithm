input = require('fs').readFileSync(__dirname+'/test.txt').toString().split('\n');
//var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

for(let i = 0; i < input.length; i++) {
    const [A, B, C] = input[i].split(" ").map(Number);

    const maxLength = Math.max(A, B, C);
    const isInvalid = (A + B + C - maxLength) <= maxLength;

    if(A == 0 && B == 0 && C == 0) {
        break;
    }else if(A == B && A == C && B == C){
        console.log("Equilateral");
    }else if(!isInvalid && ((A == B) ||  (A == C) || (B == C))){
        console.log("Isosceles")
    }else if(!isInvalid){
        console.log("Scalene");
    }else{
        console.log("Invalid");
    }
}