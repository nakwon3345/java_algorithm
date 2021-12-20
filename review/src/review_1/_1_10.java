package review_1;

import java.util.Scanner;

public class _1_10 {
	
	public static int solution(String str) {
		String answer = "";
		str = str.replaceAll("[^0-9]", "");
		answer = str;
//		for(char x : str.toCharArray()) {
//			if(Character.isDigit(x)) {
//				answer += x;
//			}
//		}
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(solution(str));
	}

}
