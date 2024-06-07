package Medium;

import java.util.*;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> result = new ArrayList<>(); // 결과
        int length  = groupSizes.length;
        Map<Integer, List<Integer>> map = new HashMap<>(); // map

        int size;
        for(int i = 0; i < length; i++){
            size = groupSizes[i];
            // Map에 없을 경우 리스트 추가
            if(!map.containsKey(size)){
                map.put(size, new ArrayList<>());
            }

            map.get(size).add(i);

            // Group Size와 리스트 길이 같을때 Result에 저장
            if(map.get(size).size() == size){
                result.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        GroupThePeopleGivenTheGroupSizeTheyBelongTo obj = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
        int[] groupSizes = {3,3,3,3,3,1,3};
        System.out.println(obj.groupThePeople(groupSizes));
        groupSizes = new int[] {2,1,3,3,3,2};
        System.out.println(obj.groupThePeople(groupSizes));

    }

}
