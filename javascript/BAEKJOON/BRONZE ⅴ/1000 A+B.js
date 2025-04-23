//var input = require('fs').readFileSync(__dirname+'/test.txt').toString().split(' ');
var input = require('fs').readFileSync('/dev/stdin').toString().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
console.log(a+b);