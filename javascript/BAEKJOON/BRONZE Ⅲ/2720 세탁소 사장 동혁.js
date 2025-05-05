var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split('\n');
//var input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

for (let i = 1; i <= parseInt(input[0]) ; i++) {

    let C = parseInt(input[i]);

    const quarter = Math.floor(C / 25);
    C %= 25;

    const dime = Math.floor(C / 10);
    C %= 10;

    const nickel = Math.floor(C / 5);
    C %=  5;

    const penny = C;

    console.log(`${quarter} ${dime} ${nickel} ${penny}`);
}