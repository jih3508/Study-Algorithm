var input = require('fs').readFileSync(__dirname+'/test.txt').toString();
//var input = require('fs').readFileSync('/dev/stdin').toString().split(' ');
for (let i = Number(input); i > 0 ; i--) {
    console.log("*".repeat(i));
}