/**
 * @param {number[]} A
 * @param {number[]} B
 * @return {number[]}
 */
var findThePrefixCommonArray = function(A, B) {

    const size = A.length;
    let C = Array(size).fill(0);

    for (let i = 0; i < size; i++) {
        for (let j = 0; j <= i; j++) {
            for (let k = 0; k <= i; k++) {
                if(A[j] === B[k]){
                    C[i]++;
                    break;
                }
            }
        }
    }

    return C
};

A = [1,3,2,4]
B = [3,1,2,4]
console.log(findThePrefixCommonArray(A, B));

A = [2,3,1]
B = [3,1,2]
console.log(findThePrefixCommonArray(A, B));