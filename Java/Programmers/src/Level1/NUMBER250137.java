package Level1;

/*
 - 문제: 붕대 감기
 - URL: https://school.programmers.co.kr/learn/courses/30/lessons/250137
 */
public class NUMBER250137 {

    public int solution(int[] bandage, int health, int[][] attacks) {

        final int castTime = bandage[0]; // 사전시간
        final int healPerSec = bandage[1]; // 초당 회복양
        final int bonusHeal = bandage[2]; // 추가 획복량

        int currentHealth = health; // 현재 체력 초기화
        int lastAttackTime = 0; // 이전 시간 저장

        for (int[] attack : attacks) {

            int attackTime = attack[0]; // 공격 시간
            int damage = attack[1]; // 공격 데미지

            // 공격 간 회복 시간
            int healingTime = attackTime - lastAttackTime - 1;

            // 회복량 계산
            int basicHeal = healingTime * healPerSec;
            int bonusHealAmount = (healingTime / castTime) * bonusHeal;

            // 체력 회복 및 공격 처리
            currentHealth = Math.min(currentHealth + basicHeal + bonusHealAmount, health) - damage;

            // 사망 확인
            if (currentHealth <= 0) return -1;

            // 이전 시간 저장
            lastAttackTime = attackTime;
        }

        return currentHealth;
    }



    public static void main(String[] args) {
        NUMBER250137 obj = new NUMBER250137();

        int[] bandage = {5, 1, 5};
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(obj.solution(bandage, 30, attacks));

        bandage = new int[] {3, 2, 7};
        attacks = new int[][] {{1, 15}, {5, 16}, {8, 6}};
        System.out.println(obj.solution(bandage, 20, attacks));

        bandage = new int[] {4, 2, 7};
        attacks = new int[][] {{1, 15}, {5, 16}, {8, 6}};
        System.out.println(obj.solution(bandage, 20, attacks));

        bandage = new int[] {1, 1, 1};
        attacks = new int[][] {{1, 2}, {3, 2}};
        System.out.println(obj.solution(bandage, 5, attacks));
    }
}
