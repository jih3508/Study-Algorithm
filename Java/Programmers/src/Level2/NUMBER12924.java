package Level2;

public class NUMBER12924 {
  public int solution(int n) {
    int answer = 0;

    for (int i = 1; i <= n; i++) {
      int sum = 0;
      for (int j = i; j <= n; j++) {
        sum += j;
        if(sum == n) answer++;
        else if(sum > n) break;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    NUMBER12924 obj = new NUMBER12924();
    System.out.println(obj.solution(15));


  }
}
