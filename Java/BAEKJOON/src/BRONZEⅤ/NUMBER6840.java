package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NUMBER6840 {
	
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		String str;
		while((str = br.readLine()) != null) {
			list.add(Integer.parseInt(str));
		}
		list.sort(null);
		System.out.println(list.get(list.size() / 2));
	}

}
