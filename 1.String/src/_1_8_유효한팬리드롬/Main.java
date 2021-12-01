package _1_8_유효한팬리드롬;

import java.util.Scanner;

public class Main {
	
	public String solution(String str){
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equals(reverse)) {
			answer = "YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
