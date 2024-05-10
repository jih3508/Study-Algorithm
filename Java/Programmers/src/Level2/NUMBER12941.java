package Level2;

import java.util.*;

public class NUMBER12941 {

  public int solution(int []A, int []B)
  {
    int answer = 0;
    int lenth = A.length; // 배열 크기

    // A, B 배열 정렬
    Arrays.sort(A);
    Arrays.sort(B);

    // 최소값을 구해야 하기 때문에 한쪽은 큰곳 다른 한쪽은 작은쪽 부터 시작하기 때문에 B는 역순으로 시작
    for(int i = 0; i < lenth; i++){
      answer += A[i] * B[lenth-1-i];
    }

    return answer;
  }

  public static void main(String[] args) {
    NUMBER12941 obj = new NUMBER12941();
    System.out.println(obj.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
    System.out.println(obj.solution(new int[] {1, 2}, new int[] {3, 4}));
  }
}
