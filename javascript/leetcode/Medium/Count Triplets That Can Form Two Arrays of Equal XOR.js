/**
 * @param {number[]} arr
 * @return {number}
 */
var countTriplets = function(arr) {

    const size = arr.length;
    let prefixXor = Array(size).fill(0);

    prefixXor[1] = arr[0];
    // prefixXor[i]는 arr[0]부터 arr[i-1]까지의 XOR 연산 결과를 저장
    for (let i = 1; i < size; i++) {
        prefixXor[i + 1] = arr[i] ^ prefixXor[i];
    }

    let count = 0;
    for (let i = 0; i < size - 1; i++) {
        for (let j = i + 1; j < size; j++) {
            for (let k = j; k < size; k++) {
                // arr[i]부터 arr[j-1]까지의 XOR 값과 arr[j]부터 arr[k]까지의 XOR 값이 같을 경우 카운트 증가
                count += (prefixXor[j] ^ prefixXor[i]) === (prefixXor[k + 1] ^ prefixXor[j]);
            }
        }
    }

    return count;
};


console.log(countTriplets([2,3,1,6,7]));
console.log(countTriplets([1,1,1,1,1]));