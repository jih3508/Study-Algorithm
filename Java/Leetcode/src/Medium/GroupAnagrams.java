package Medium;

import java.lang.*;
import java.util.*;

/**
 * 49. Group Anagrams
 * https://leetcode.com/problems/group-anagrams/description
 */

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        // 키: 정렬된 문자열. 애너그램끼리는 정렬 결과가 같아서 그룹의 대표값으로 쓸 수 있다
        Map<String, List<String>> group = new HashMap<>();

        for(String word : strs){
            // String은 불변이라 직접 정렬할 수 없음 → char[]로 꺼내서 정렬
            char[] chars =  word.toCharArray();
            Arrays.sort(chars);
            // char[]를 그대로 키로 쓰면 안 됨: 배열의 equals/hashCode는 주소 기준이라 내용이 같아도 서로 다른 키가 된다
            String key = new String(chars);
            // get → null 체크 → put 세 단계를 한 줄로 줄임. 키가 처음 나올 때만 리스트를 새로 만든다
            // 뒤에 추가만 하니 LinkedList, ArrayList 모두 O(1)이지만 메모리와 캐시 효율은 ArrayList가 더 낫다
            group.computeIfAbsent(key , k -> new LinkedList<>()).add(word);
        }

        // values()는 Map에 연결된 뷰(Collection)일 뿐이라, 반환 타입 List에 맞게 새 리스트로 복사한다.
        return new ArrayList<>(group.values());
    }

    public static void main(String[] args) {

        GroupAnagrams sol = new GroupAnagrams();
        System.out.println(sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(sol.groupAnagrams(new String[]{""}));
        System.out.println(sol.groupAnagrams(new String[]{"a"}));
    }

}
