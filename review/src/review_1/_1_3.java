package review_1;

import java.util.Scanner;

public class _1_3 {
	
	public static String solution(String str) {
		String answer = "";
		int m = 0;
		String[] s = str.split(" ");
		for(String x : s){
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(solution(str));
	}

}
