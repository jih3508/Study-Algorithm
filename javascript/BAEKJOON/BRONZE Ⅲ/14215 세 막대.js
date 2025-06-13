var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim();
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim();

const lengths= input.split(' ').map(Number).sort((a, b) => a - b);

if(lengths[0] + lengths[1] > lengths[2]){
    console.log(lengths[0] + lengths[1] + lengths[2]);
}else{
    console.log((lengths[0] + lengths[1]) * 2 - 1);
}


