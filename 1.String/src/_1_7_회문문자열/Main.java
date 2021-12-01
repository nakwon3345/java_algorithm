package _1_7_회문문자열;

import java.util.Scanner;

public class Main {
	
	public String solution(String str){
		String answer = "YES";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) {
			return answer;
		}
//		str = str.toUpperCase();
//		int len = str.length();
//		for(int i = 0; i < len/2; i++) {
//			if(str.charAt(i) != str.charAt(len - i - 1)) {
//				return "NO";
//			}
//		}
		return "NO";
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
 		System.out.println(T.solution(str));
	}

}
