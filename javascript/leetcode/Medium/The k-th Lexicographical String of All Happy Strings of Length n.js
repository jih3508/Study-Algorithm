
var getHappyString = function(n, k) {

    const alphas = ["a", "b", "c"]

    let strings = [];

    const backtracking = (str) =>{
        if(str.length === n){
            strings.push(str);
            return ;
        }

        for(const alpha of alphas) {
            if(str[str.length - 1] !== alpha){
                backtracking(str + alpha)
            }
        }
    }

    backtracking("");
    return strings.length >= k ? strings[k-1] : "";
};

console.log(getHappyString(1, 3))
console.log(getHappyString(1, 4))
console.log(getHappyString(3, 9))