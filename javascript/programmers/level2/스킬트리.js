function solution(skill, skill_trees) {
    let count = 0; // 결과값
    skill_trees.forEach(skill_tree => {

        let skill_list = skill.split(''); // 문자열 -> 각 알파벳으로 list로 변경
        let flag = true; // 추가 여부

        for(let k1 of skill_tree){
            // 스킬트리에 선행 스킬들을 포함 되는 경우
            if(skill_list.includes(k1)){
                // 앞에 스킬들을 뺀다
                const k2 = skill_list.shift() // skill_list에서 가장 앞의 스킬을 제거하고 가져옴
                // 스킬 트리에서 등장한 k1이 예상한 선행 스킬(k2)이 아니라면 잘못된 스킬 트리
                if(k1 !== k2){
                    flag = false;
                    break;
                }
            }
        }

        // flag가 true면 유효한 스킬 트리이므로 count 증가
        if(flag) count++;
    })

    return count;
}


skill = "CBD"
skill_trees = ["BACDE", "CBADF", "AECB", "BDA"]
console.log(solution(skill, skill_trees));