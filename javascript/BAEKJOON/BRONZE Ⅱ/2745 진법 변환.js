var input = require('fs').readFileSync(__dirname+'/test.txt').toString().split(' ');
//var input = require('fs').readFileSync('/dev/stdin').toString().split(' ');
let [N, B] = input;
// B로 진법 변환
console.log(parseInt(N, B));