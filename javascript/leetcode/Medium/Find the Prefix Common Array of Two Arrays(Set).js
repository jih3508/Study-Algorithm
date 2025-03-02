/**
 * @param {number[]} A
 * @param {number[]} B
 * @return {number[]}
 */
var findThePrefixCommonArray = function(A, B) {

    const size = A.length;
    let C = Array(size).fill(0);
    let setA = new Set();
    let setB = new Set();

    for (let i = 0; i < size; i++) {
        setA.add(A[i]);
        setB.add(B[i]);
        C[i] = i - setA.difference(setB).size + 1;

    }

    return C;
};

A = [1,3,2,4]
B = [3,1,2,4]
console.log(findThePrefixCommonArray(A, B));

A = [2,3,1]
B = [3,1,2]
console.log(findThePrefixCommonArray(A, B));