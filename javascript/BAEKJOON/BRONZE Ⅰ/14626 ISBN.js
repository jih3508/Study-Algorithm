var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim();
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim();

const original = input;

for (let i = 0; i <= 9; i++) {
    const ISBN = original.replace("*", i);

    let sum = 0;
    for (let j = 0; j < 13; j++) {
        sum += j % 2 === 0? parseInt(ISBN.charAt(j)) : parseInt(ISBN.charAt(j)) * 3
    }

    if(sum % 10 === 0){
        console.log(i);
        break;
    }
}
