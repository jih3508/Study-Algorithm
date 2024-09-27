package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertAnArrayIntoA2DArrayWithConditions {

    public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        Arrays.stream(nums).forEach(num -> {
            int size = result.size();
            boolean flag = true; // 새로 리스트 추가 여부

            for (int i = 0; i < size; i++) {
                // 현재 위치에서 num이 없을 경우 추가한다.
                if (!result.get(i).contains(num) && flag){
                    flag = false;
                    result.get(i).add(num);
                }
                if(!flag){break;}
            }
            // 담을 위치 없을 경우 새로 리스트 추가해서 담는다.
            if(flag){
                result.add(new ArrayList<>());
                result.get(size).add(num);
            }
        });

        return result;
    }

    public static void main(String[] args) {

        ConvertAnArrayIntoA2DArrayWithConditions obj = new ConvertAnArrayIntoA2DArrayWithConditions();
        int[] nums = {1,3,4,1,2,3,1} ;
        System.out.println(obj.findMatrix(nums));
        nums = new int[] {1,2,3,4} ;
        System.out.println(obj.findMatrix(nums));
    }

}
