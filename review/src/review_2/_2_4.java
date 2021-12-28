package review_2;

import java.util.Scanner;

public class _2_4 {
	
	public static int[] solution(int t) {
		int[] answer = new int[t];
		answer[0] = 1;
		answer[1] = 1;
		for(int i = 2; i < t; i++) {
			answer[i] = answer[i - 1] + answer[i - 2];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		for(int x : solution(t)) {
			System.out.print(x + " ");
		}
	}
}
