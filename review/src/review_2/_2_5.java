package review_2;

import java.util.Scanner;

public class _2_5 {
	
	public static int solution(int t) {
		int answer = 0;
		int[] tmp = new int[t + 1];
		for(int i = 2; i <= t ; i++) {
			if(tmp[i] == 0) {
				answer++;
				for(int j = i; j <= t; j = j + i) {
					tmp[j] = 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		System.out.println(solution(t));
	}
}
