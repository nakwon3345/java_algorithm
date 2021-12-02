package _2_6_뒤집은소수;

import java.util.Scanner;

public class Main {
	
	public static int solution(int t, int[] arr){
		int answer = 0;
		int[] tmp = new int[t + 1];
		for(int i = 2; i <= t; i++) {
			if(tmp[i] == 0) {
				answer++;
				for(int j = i; j <= t; j = j + 1) {
					tmp[j] = 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int[] arr = kb.nextInt();
		System.out.println(solution(t, arr));
	}
}
