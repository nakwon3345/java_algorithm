package _3_4_연속부분수열;

import java.util.Scanner;

public class Main {
	public static int solution(int t, int p, int[] arr){
		int answer = 0;
		int sum = 0;
		int lt = 0;
		for(int i = 0; i < t; i++) {
			sum += arr[i];
			if(sum == p) {
				answer++;
			}
			while(sum >= p) {
				sum -= arr[lt++];
				if(sum == p) {
					answer++;
				}
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int p = kb.nextInt();
		int[] arr = new int[t];
		for(int i = 0 ; i < t; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(t, p, arr));
	}
}
