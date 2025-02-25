/**
 * @param {number} num
 * @return {number}
 */
var maximumSwap = function(num) {
  let maxNum = num;
  let numArray = num.toString().split('').map(n => parseInt(n));
  const size = numArray.length;

  for (let i = 0; i < size - 1; i++) {
    for (let j = i + 1; j < size; j++) {

      // swap
      let tmp = numArray[i];
      numArray[i] = numArray[j];
      numArray[j] = tmp;

      // 기존 값이랑 바뀐 값중 더 큰 값으로 저장 한다.
      maxNum= Math.max(maxNum, parseInt(numArray.join('')))

      // 다시 원 위치
      tmp = numArray[i];
      numArray[i] = numArray[j];
      numArray[j] = tmp;

    }
  }

  return maxNum;

};

console.log(maximumSwap(2736))

console.log(maximumSwap(9973))


