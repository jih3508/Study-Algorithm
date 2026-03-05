var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim();
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").toString().trim();

const B = parseInt(input)
console.log(B - B / 11)