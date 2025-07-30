/**
 * @param {number} n
 * @param {number} m
 * @return {number}
 */
var differenceOfSums = function(n, m) {

    let result = 0;

    for (let i = 1; i <= n; i++) {
        // m의 배수가 아니면 더한다.
        if(i % m === 0) {
            result -= i;
            // m의 배수일때 뺀다.
        }else{
            result += i;
        }
    }

    return result;

};

console.log(differenceOfSums(10, 3));
console.log(differenceOfSums(5, 6));
console.log(differenceOfSums(5, 1));