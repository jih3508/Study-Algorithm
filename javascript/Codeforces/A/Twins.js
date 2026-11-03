var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//const input = require("fs").readFileSync(0, "utf8").trim().split("\n");

const n = parseInt(input[0]);
const a = input[1].trim().split(" ").map(Number);
const sum = a.reduce((acc, num) => num + acc, 0)
// 큰 동전부터 가져가야 같은 합을 가장 적은 개수로 만들 수 있다
a.sort((x, y) => x - y);

let [temp, count] = [0, 0];

for (let i = n - 1; i >= 0 ; i--) {
    temp += a[i];
    count++;
    // 내 합 > 남은 합(sum - temp)을 정리한 식, 동률은 실패라 >를 쓴다
    if(temp * 2 > sum){
        break;
    }
}

console.log(count);
