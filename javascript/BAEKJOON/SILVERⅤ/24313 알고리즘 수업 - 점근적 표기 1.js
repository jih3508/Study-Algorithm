var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

const [a1, a2] = input[0].split(" ").map(Number);
const c = parseInt(input[1]);
const n0 = parseInt(input[2]);

console.log((a1 * n0 + a2 <= c * n0) && a1 <= c? 1 : 0 );