package Level2;

import java.util.*;

public class NUMBER12941 {

  public int solution(int []A, int []B)
  {
    int answer = 0;
    int lenth = A.length; // 배열 크기

    PriorityQueue<Integer> heapA = new PriorityQueue<>();
    PriorityQueue<Integer> heapB = new PriorityQueue<>();


    // A, B 배열 heap에 저장
    for(int i = 0; i < lenth; i++){
      heapA.add(A[i]);
      heapB.add(-1 * B[i]); // B는 큰 순으로 저장해야 하기 때문에 -1로 해서 MaxHeap 처리 한다.
    }

    for(int i = 0; i < lenth; i++){
      // A는 작은순 B는 큰순으로 뽑아서 곱해서 더한다.
      // B는 MaxHeap로 -1 곱해서 저장해서 꺼낼때 -1을 곱해야 한다.
      answer += heapA.poll() * -1 * heapB.poll();
    }

    return answer;
  }

  public static void main(String[] args) {
    NUMBER12941 obj = new NUMBER12941();
    System.out.println(obj.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
    System.out.println(obj.solution(new int[] {1, 2}, new int[] {3, 4}));
  }
}
