/**
 * 2703. Return Length of Arguments Passed
 * https://leetcode.com/problems/return-length-of-arguments-passed/
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    return args.length;
};

console.log(argumentsLength(1, 2, 3));
console.log(argumentsLength(5));
console.log(argumentsLength({}, null, "3"));