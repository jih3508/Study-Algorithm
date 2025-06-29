
/*
 * 알고리즘 수업 - 알고리즘의 수행 시간 3
 * url: https://www.acmicpc.net/problem/24264
 */
var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

const n = parseInt(input[0]);

console.log(n * n);
console.log(2);