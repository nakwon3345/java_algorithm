package review_1;

import java.util.Scanner;

public class _1_9 {
	
	public static int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		int p = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		p = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == c) {
				p = 0;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		for(int x : solution(str, c)) {
			System.out.print(x + " ");
		}
	}

}