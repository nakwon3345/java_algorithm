package review_1;

import java.util.Scanner;

public class _1_11_복습 {
	
	public static String solution(String str) {
		String answer = "";
		str = str + "";
		int cnt = 1;
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			}else {
				answer += str.charAt(i);
				if(cnt >= 1) {
					answer += String.valueOf(cnt);
					cnt = 1;
				}
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
