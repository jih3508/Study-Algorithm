package Medium;

import java.util.*;

/**
 * 문제: Top K Frequent Elements
 * url: https://leetcode.com/problems/top-k-frequent-elements/description/
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        // 값 -> 등장 횟수
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            // null 분기를 직접 쓰지 않아도 되고, 람다에서 안 쓰는 key 파라미터도 사라진다
            counter.merge(num, 1, Integer::sum);
        }

        // 빈도가 가장 낮은 원소가 맨 위에 오는 최소 힙, 크기는 k로 유지
        // 전부 넣고 k번 꺼내는 대신 "상위 k개 후보"만 들고 가서 O(m log m) -> O(m log k)
        // 빈도를 음수로 뒤집는 트릭이 필요 없다: 가장 약한 후보를 버리는 게 목적이라 최소 힙이 맞다
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        // keySet + get 대신 entrySet: 키마다 해시 조회를 한 번 더 하는 낭비를 없앤다
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            heap.offer(new int[] {entry.getValue(), entry.getKey()});

            // k+1개가 되는 순간 가장 빈도가 낮은 원소를 버린다 (탈락한 원소는 상위 k에 들 수 없음)
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // 힙에는 정확히 상위 k개만 남아 있다. 순서 요구가 없으니 꺼내는 대로 채운다
        // k가 고유 값 개수보다 크면 여기서 NPE가 나지만, 문제 조건상 발생하지 않는다
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll()[1];
        }

        return result;
    }

    public static void main(String[] args) {

        TopKFrequentElements solution = new TopKFrequentElements();

        int[] nums = new int[] {1,1,1,2,2,3};
        System.out.println(Arrays.toString(solution.topKFrequent(nums, 2)));
        nums = new int[] {1};
        System.out.println(Arrays.toString(solution.topKFrequent(nums, 1)));
        nums = new int[] {1,2,1,2,1,2,3,1,3,2};
        System.out.println(Arrays.toString(solution.topKFrequent(nums, 2)));

    }

}
