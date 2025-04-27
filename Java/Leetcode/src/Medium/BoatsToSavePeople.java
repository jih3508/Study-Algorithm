package Medium;

import java.util.Arrays;

public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {

        // 사람들의 몸무게를 오름차순으로 정렬
        Arrays.sort(people);
        int count = 0; // 필요한 보트 수
        int start = 0;
        int end = people.length - 1;


        while(start <= end){
            System.out.println(String.format("start: %d, end: %d", start, end));

            // 가장 가벼운 사람과 가장 무거운 사람의 몸무게 합이 limit 이하인 경우 두 사람을 한 보트에 태웁니다
            // 두 사람의 몸무게 합이 limit를 초과하는 경우 가장 무거운 사람만 보트에 태웁니다
            if(people[start] + people[end--] <= limit){
                start++;
            }
            count++; // 사용한 보트 수를 증가
        }

        return count;
    }

    public static void main(String[] args) {
        BoatsToSavePeople obj = new BoatsToSavePeople();
        int[] people = {1, 2};
        System.out.println(obj.numRescueBoats(people, 3));
        people = new int[]{3,2,2,1};
        System.out.println(obj.numRescueBoats(people, 3));
        people = new int[]{3,5,3,4};
        System.out.println(obj.numRescueBoats(people, 5));
    }
}
