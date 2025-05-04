/*
 - 문제: 붕대 감기
 - URL: https://school.programmers.co.kr/learn/courses/30/lessons/250137
 */
function solution(bandage, health, attacks) {

    const castTime = bandage[0]; // 사전시간
    const healPerSec = bandage[1]; // 초당 회복양
    const bonusHeal = bandage[2]; // 추가 획복량

    let currentHealth = health; // 현재 체력 초기화
    let lastAttackTime = 0; // 이전 시간 저장

    attacks.some(attack => {

        const attackTime = attack[0]; // 공격 시간
        const damage = attack[1]; // 공격 데미지

        // 공격 간 회복 시간
        const healingTime = attackTime - lastAttackTime - 1;

        // 회복량 계산
        const basicHeal = healingTime * healPerSec;
        const bonusHealAmount = Math.floor(healingTime / castTime) * bonusHeal;

        // 체력 회복 및 공격 처리
        currentHealth = Math.min(currentHealth + basicHeal + bonusHealAmount, health) - damage;


        // 사망 확인
        if (currentHealth <= 0){
            currentHealth = -1;
            return true;
        }

        // 이전 시간 저장
        lastAttackTime = attackTime;

    });

    return currentHealth;
}

let bandage = [5, 1, 5];
let attacks = [[2, 10], [9, 15], [10, 5], [11, 5]];
console.log(solution(bandage, 30, attacks));

bandage = [3, 2, 7];
attacks = 	[[1, 15], [5, 16], [8, 6]];
console.log(solution(bandage, 20, attacks));

bandage = [4, 2, 7];
attacks = 	[[1, 15], [5, 16], [8, 6]];
console.log(solution(bandage, 20, attacks));

bandage = [1, 1, 1];
attacks = 	[[1, 2], [3, 2]];
console.log(solution(bandage, 5, attacks));