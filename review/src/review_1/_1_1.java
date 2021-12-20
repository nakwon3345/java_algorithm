package review_1;

import java.util.Scanner;

public class _1_1 {
	public static int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		for(char x : str.toCharArray()) {
			if(x == c) {
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.println(solution(str, c));
	}

}
