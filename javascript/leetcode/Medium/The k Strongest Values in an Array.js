/**
 * @param {number[]} arr
 * @param {number} k
 * @return {number[]}
 */
var getStrongest = function(arr, k) {

    // 배열을 오름차순으로 정렬
    arr.sort((a, b) => a - b);

    // 중간값(median) 계산
    const size = arr.length;
    const m = arr[Math.floor((size - 1) / 2)];

    // 원본 배열을 복사하여 강도 기준으로 정렬
    return arr.sort((a, b) => {
        const x = Math.abs(a - m);
        const y = Math.abs(b - m);
        // 강도가 같으면 더 큰 값을 앞에, 다르면 강도가 더 큰 것을 앞에
        return x === y ? b - a : y - x;
    }).slice(0, k);

};


console.log(getStrongest([1, 2, 3, 4, 5], 2));        // [5, 1]
console.log(getStrongest([1, 1, 3, 5, 5], 2));        // [5, 5]
console.log(getStrongest([6, 7, 11, 7, 6, 8], 5));    // [11, 8, 6, 6, 7]
console.log(getStrongest([-7,22,17,3], 2));    // [-7,22,17,3]