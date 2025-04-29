package GOLDⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NUMBER5639 {

    static List<Integer> nodes; // 노드 값을 저장할 리스트

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        nodes = new ArrayList<>();
        nodes.add(Integer.valueOf(br.readLine()));
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            nodes.add(Integer.valueOf(line));
        }

        // 전체 트리에 대해 후위 순회 수행 (0부터 마지막 인덱스까지)
        postOrder(0, nodes.size() - 1);

    }

    /*
     * 전위 순회 결과로부터 후위 순회 결과를 생성하는 함수
     * root: 현재 서브트리의 루트 노드 인덱스
     * end: 현재 서브트리의 마지막 노드 인덱스
     */
    static void postOrder(int root, int end){

        // 기저 조건: 유효하지 않은 범위면 종료
        if(root > end){
            return;
        }

        int start = root + 1; // 루트 다음 노드(왼쪽 서브트리의 시작)
        int node = nodes.get(root); // 현재 서브트리의 루트 값
        int mid = start;

        // 오른쪽 서브트리의 시작점(mid)을 찾음
        // 루트 값보다 큰 첫 번째 노드가 오른쪽 서브트리의 시작
        while(mid <= end){
            if(node < nodes.get(mid)){
                break;
            }
            mid++;
        }

        // 왼쪽 서브트리 후위 순회 (start부터 mid-1까지)
        postOrder(start, mid - 1);
        // 오른쪽 서브트리 후위 순회 (mid부터 end까지)
        postOrder(mid, end);
        // 현재 노드 출력 (후위 순회에서는 루트가 마지막에 방문됨)
        System.out.println(node);
    }
}
