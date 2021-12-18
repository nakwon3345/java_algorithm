package _3_5_연속된자연수의합;

import java.util.Scanner;

public class Main2 {
	public static int solution(int t){
		int answer = 0;
		int cnt = 1;
		t--;
		while(t > 0) {
			cnt++;
			t = t - cnt;
			if(t % cnt == 0) {
				answer++;
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
