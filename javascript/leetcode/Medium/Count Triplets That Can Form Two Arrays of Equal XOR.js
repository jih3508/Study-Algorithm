/**
 * @param {number[]} arr
 * @return {number}
 */
var countTriplets = function(arr) {

    const size = arr.length;
    let prefixSum = Array(size).fill(0);

    prefixSum[1] = arr[0];
    for (let i = 1; i < size; i++) {
        prefixSum[i + 1] = arr[i] ^ prefixSum[i];
    }

    let count = 0;
    for (let i = 1; i <= size - 1; i++) {
        for (let j = i + 1; j <= size; j++) {
            for (let k = j; k <= size; k++) {
                count += (prefixSum[j] ^ prefixSum[i - 1]) === (prefixSum[k] ^ prefixSum[j]);
            }
        }
    }

    return count;
};


console.log(countTriplets([2,3,1,6,7]));
console.log(countTriplets([1,1,1,1,1]));