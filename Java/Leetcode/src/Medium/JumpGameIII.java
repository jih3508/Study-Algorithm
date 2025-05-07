package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII {

    public boolean canReach(int[] arr, int start) {

        // 배열의 길이를 저장
        int size = arr.length;
        // 각 인덱스 방문 여부를 추적하기 위한 배열을 초기화
        boolean[] visited = new boolean[size];

        // BFS(너비 우선 탐색)를 위한 큐를 생성
        Queue<Integer> queue = new LinkedList<>();
        // 시작 인덱스를 큐에 추가하고 방문했다고 표시
        queue.add(start);
        visited[start] = true;

        // 큐가 비어있지 않는 동안 반복
        while(!queue.isEmpty()){
            // 큐에서 현재 탐색할 인덱스
            int index = queue.poll();

            // 현재 인덱스의 값이 0이면 목표에 도달했으므로 true를 반환
            if(arr[index] == 0){
                return true;
            }

            // 현재 인덱스에서 왼쪽(이전)으로 점프할 위치를 계산
            int before = index - arr[index];
            // 왼쪽 점프가 배열 범위 내에 있고 아직 방문하지 않았다면
            if(index - arr[index] >=0 && !visited[before]){
                // 해당 인덱스를 큐에 추가하고 방문했다고 표시
                queue.add(index - arr[index]);
                visited[before] = true;
            }

            // 현재 인덱스에서 오른쪽(이후)으로 점프할 위치를 계산
            int after = index + arr[index];
            // 오른쪽 점프가 배열 범위 내에 있고 아직 방문하지 않았다면
            if(after < size && visited[after] == false){
                // 해당 인덱스를 큐에 추가하고 방문했다고 표시
                queue.add(index + arr[index]);
                visited[after] = true;
            }
        }

        // 모든 가능한 점프를 시도했지만 값이 0인 인덱스에 도달하지 못했으므로 false를 반환
        return false;
    }

    public static void main(String[] args) {
        JumpGameIII obj = new JumpGameIII();
        int[] arr = {4,2,3,0,3,1,2};
        System.out.println(obj.canReach(arr, 5));

        arr = new int[]{4,2,3,0,3,1,2};
        System.out.println(obj.canReach(arr, 0));

        arr = new int[]{3,0,2,1,2};
        System.out.println(obj.canReach(arr, 2));
    }
}
