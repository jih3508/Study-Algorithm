var numTilePossibilities = function(tiles) {

    let strings = new Set(); // 중복을 제거하기 위한 HashSet (만들어진 모든 문자열을 저장)
    const size = tiles.length; // 타일의 총 개수

    /**
     * 백트래킹을 통해 모든 가능한 문자열 조합을 생성
     * @param str 현재까지 만들어진 문자열
     * @param visited 각 타일의 사용 여부를 나타내는 배열
     */
    const backtracking = (arr, visited) =>{

        // 현재 문자열의 길이가 타일 개수를 초과하면 종료
        // (실제로는 이 조건에 도달하지 않음 - 안전장치)
        if(arr.length > size){
            return;
        }

        // 현재 만들어진 문자열을 결과 세트에 추가
        // 중복은 자동으로 제거됨
        strings.add(arr.join());

        for(let i = 0; i < size; i++){
            // 아직 사용하지 않은 타일인 경우
            if (!visited[i]) {
                arr.push(tiles[i]); // 현재 타일의 글자를 문자열에 추가
                visited[i] = true; // 해당 타일을 사용됨으로 표시

                backtracking(arr, visited); // 재귀적으로 더 긴 문자열 탐색

                // 백트래킹: 이전 상태로 되돌리기
                arr.pop();
                visited[i] = false; // 타일을 다시 미사용 상태로 변경
            }
        }


    };

    let visited = Array(size).fill(false); // 모든 타일을 미사용 상태로 초기화
    backtracking([], visited);

    strings.delete("") // 빈 문자열은 제외 (문제에서 비어있지 않은 시퀀스를 요구)
    return strings.size;

};

console.log(numTilePossibilities("AAB"))
console.log(numTilePossibilities("AAABBC"))
console.log(numTilePossibilities("V"))