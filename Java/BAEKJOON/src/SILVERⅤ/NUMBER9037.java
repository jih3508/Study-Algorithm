package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER9037 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int N, count;
        int[] C;

        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            C = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                C[j] = Integer.parseInt(st.nextToken());
            }

            count = 0;
            while (true){
                C = checkCandy(C);
                if(isSameCandy(C)){
                    break;
                }
                C = roundCandy(C);
                count++;

            }

            System.out.println(count);
        }

    }

    /*
     * 사탕 짝수개 맞추는 작업
     */
    public static int[] checkCandy(int[] candies){

        for(int i = 0; i < candies.length; i++){
            // 캔디 개수가 홀 수이면 1개 추가한다.
            if(candies[i] % 2 == 1){
                candies[i]++;
            }
        }

        return candies;
    }

    /*
     * 사탕 개수 같은지 확인하는 메소드
     */
    public static boolean isSameCandy(int[] candies){
        for(int candy : candies){
            // 모든 사탕은 같아야 하기 때문에
            if (candy != candies[0]){
                return false;
            }
        }
        return true;
    }

    /*
     * 사탕 순환
     */
    public static int[] roundCandy(int[] candies){

        int len = candies.length;

        int[] newCandies = new int[len];

        for(int i = 0; i < len; i++){
            newCandies[(i + 1) % len] = candies[i] / 2 + candies[(i + 1) % len] / 2; // 맨끝에 있는 학생은 맨 처음의 한생으로 줘야 하기 때문에 뒤에 길이 만 큼 나눈 나머지로 해야 한다.
        }
        return newCandies;
    }
}
