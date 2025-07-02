var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

const n = parseInt(input[0]);

console.log(n * (n - 1) / 2);
console.log(2);