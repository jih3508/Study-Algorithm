"""
- 문제: 붕대 감시
- url: https://school.programmers.co.kr/learn/courses/30/lessons/250137
"""
def solution(bandage, health, attacks):
    castTime = bandage[0] # 사전시간
    healPerSec = bandage[1] # 초당 회복양
    bonusHeal = bandage[2] # 추가 획복량

    currentHealth = health # 현재 체력 초기화
    lastAttackTime = 0 # 이전 시간 저장

    for attack in attacks:
        attackTime = attack[0] # 공격 시간
        damage = attack[1] # 공격 데미지

        # 공격 간 회복 시간
        healingTime = attackTime - lastAttackTime - 1

        # 회복량 계산
        basicHeal = healingTime * healPerSec
        bonusHealAmount = (healingTime // castTime) * bonusHeal

        # 체력 회복 및 공격 처리
        currentHealth = min(currentHealth + basicHeal + bonusHealAmount, health) - damage

        # 사망 확인
        if currentHealth <= 0: return -1

        # 이전 시간 저장
        lastAttackTime = attackTime;
    
    return currentHealth

bandage = [5, 1, 5]
attacks = [[2, 10], [9, 15], [10, 5], [11, 5]]
print(solution(bandage, 30, attacks))

bandage = [3, 2, 7]
attacks = 	[[1, 15], [5, 16], [8, 6]]
print(solution(bandage, 20, attacks))

bandage = [4, 2, 7]
attacks = 	[[1, 15], [5, 16], [8, 6]]
print(solution(bandage, 20, attacks))

bandage = [1, 1, 1]
attacks = 	[[1, 2], [3, 2]]
print(solution(bandage, 5, attacks))