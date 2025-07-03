var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

const n = BigInt(input[0]);

console.log(n ** 3n + "\n3");