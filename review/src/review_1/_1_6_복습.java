package review_1;

import java.util.Scanner;

public class _1_6_복습 {
	
	public static String solution(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
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
