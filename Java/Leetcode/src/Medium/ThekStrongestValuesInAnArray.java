package Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThekStrongestValuesInAnArray {

    public int[] getStrongest(int[] arr, int k) {

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        // 중간값(median) 계산
        int size = arr.length;
        int m = arr[(size - 1) / 2];

        // 원본 배열을 복사하여 강도 기준으로 정렬
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
        list.sort((a, b) -> {
            int x = Math.abs(a - m);
            int y = Math.abs(b - m);
            return x == y? b - a : y - x;
        });

        // 상위 k개 요소 반환
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        ThekStrongestValuesInAnArray obj = new ThekStrongestValuesInAnArray();
        System.out.println(Arrays.toString(obj.getStrongest(new int[]{1,2,3,4,5}, 2)));
        System.out.println(Arrays.toString(obj.getStrongest(new int[]{1,1,3,5,5}, 2)));
        System.out.println(Arrays.toString(obj.getStrongest(new int[]{6,7,11,7,6,8}, 5)));
    }
}

