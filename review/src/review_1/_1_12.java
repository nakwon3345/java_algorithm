package review_1;

import java.util.Scanner;

public class _1_12 {
	
	public static String solution(int t, String str) {
		String answer = "";
		for(int i = 0; i < t; i++) {
			String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			str = str.substring(7);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		String str = kb.next();
		System.out.println(solution(t, str));
	}

}
