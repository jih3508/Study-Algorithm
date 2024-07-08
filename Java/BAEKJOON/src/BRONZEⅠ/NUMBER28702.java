package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER28702 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] FizzBuzz = new String[3];
        for(int i = 0; i < 3; i++){
            FizzBuzz[i] = br.readLine();
        }

        for(int i = 0; i < 3; i++){
            if(Character.isDigit(FizzBuzz[i].charAt(0))){
                int num = Integer.parseInt(FizzBuzz[i]) + 3 - i;
                if(num % 5 == 0 && num % 3 == 0){
                    System.out.println("FizzBuzz");
                }else if(num % 3 == 0){
                    System.out.println("Fizz");
                }else if(num % 5 == 0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(num);
                }
                break;
            }
        }
    }
}
