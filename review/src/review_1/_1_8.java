package review_1;

import java.util.Scanner;

public class _1_8 {
	
	public static String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			return answer;
		}
		return "NO";
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(solution(str));
	}

}
