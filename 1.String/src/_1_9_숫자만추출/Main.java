package _1_9_숫자만추출;

import java.util.Scanner;

public class Main {
	
	public int solution(String str){
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
//		int answer = 0;
//		for(char x : str.toCharArray()) {
//			if(x >= 48 && x <= 57) {
//				answer = answer * 10 + (x - 48);
//			}
//		}
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
