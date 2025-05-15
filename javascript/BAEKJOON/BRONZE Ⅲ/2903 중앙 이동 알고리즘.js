var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim();
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim();

console.log(Math.pow(Math.pow(2, input) + 1, 2));