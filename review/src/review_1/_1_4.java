package review_1;

import java.util.ArrayList;
import java.util.Scanner;

public class _1_4 {
	
	public static ArrayList<String> solution(int t, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		String[] str = new String[t];
		for(int i = 0; i < t; i++) {
			str[i] = kb.next();
		}
		for(String x : solution(t, str)) {
			System.out.println(x);
		}
		
	}

}
