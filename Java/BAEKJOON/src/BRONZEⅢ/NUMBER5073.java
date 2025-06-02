package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER5073 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int maxLength = Math.max(A, Math.max(B, C));
            boolean isInvalid = (A + B + C - maxLength) <= maxLength;

            if(A == 0 && B == 0 && C == 0) {
                break;
            } else if ((A == B) && (A == C) && (B == C)) {
                System.out.println("Equilateral");
            } else if (!isInvalid && ((A == B) ||  (A == C) || (B == C))) {
                System.out.println("Isosceles");
            }else if(!isInvalid){
                System.out.println("Scalene");
            }else{
                System.out.println("Invalid");
            }
        }

    }
}
