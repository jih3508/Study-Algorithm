package BRONZEⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER16769 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int [] cups = new int[3];
        int [] milks = new int[3];

        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            cups[i] = Integer.parseInt(st.nextToken());
            milks[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int now, next;

        while(count < 100){
            now = count % 3; // 현재 컵
            next = (count + 1) % 3; // 옮길 컵
            milks[next] += milks[now];

            // 컵에 우유가 꽉 찼을 때
            if(milks[next] > cups[next]){
                milks[now] = milks[next] % cups[next];
                milks[next] = cups[next];
            }else {
                milks[now] = 0;
            }

            count++;
        }

        Arrays.stream(milks).forEach(System.out::println);

    }
}
