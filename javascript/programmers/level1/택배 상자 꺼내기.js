function solution(n, w, num) {
    const size = Math.floor(n / w) + (n % w >0 ? 1 : 0);
    let boxs = Array(size)
    for (let i = 0; i < size; i++) {
        boxs[i] = Array(w).fill(0)
    }

    let i = 1;
    let x = size - 1;
    let y = 0;
    let move = 1;
    let location = [0, 0]
    while(i <= n){
        boxs[x][y] = i;
        if(i === num){
            location[0] = x;
            location[1] = y;
        }
        if(i % w === 0){
            x -= 1;
            move = move * -1;
        }else{
            y += move
        }

        i++;
    }
    boxs.forEach((box, i) => {
        console.log(box);
    })
    return location[0] + (boxs[0][location[1]] === 0? 0 : 1);
}

console.log(solution(22,6,8))
console.log(solution(13, 3, 6))