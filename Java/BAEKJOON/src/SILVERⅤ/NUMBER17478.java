package SILVER��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER17478 {
	
	static int count = 0;
	
    public static void main(String[] args) throws IOException{

	   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   	count =  Integer.valueOf(br.readLine());
	   	System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
	   	printRecurcive(0);
    }
    
    public static void printRecurcive(int n) {
    	String hipun = "";
  		for(int i = 0; i < n; i++) {
  			 hipun += "____";
  		 }
    	
    	if(n < count) {   		 
	   		 System.out.println(hipun + "\"����Լ��� ������?\"");
	   		 System.out.println(hipun + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
	   		 System.out.println(hipun + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
	   		 System.out.println(hipun + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
	   		 printRecurcive(n + 1);
	   		 System.out.println(hipun + "��� �亯�Ͽ���.");
   	 	}else if(n == count) {
	   	 	System.out.println(hipun + "\"����Լ��� ������?\"");
	   	 	System.out.println(hipun + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
	   	 	System.out.println(hipun + "��� �亯�Ͽ���.");
   	 	}

    }
}
