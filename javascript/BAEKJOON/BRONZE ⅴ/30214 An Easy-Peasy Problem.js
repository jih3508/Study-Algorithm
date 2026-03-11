var input = require('fs').readFileSync(__dirname+'/test.txt').toString().split(' ');
//var input = require('fs').readFileSync('/dev/stdin').toString().split(' ');

const [S1, S2] = input.map(num => parseFloat(num))

console.log(S1 >= (S2 / 2)? "E" : "H")