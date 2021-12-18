package _3_3_최대매출;

import java.util.Scanner;

public class Main {
	public static int solution(int t, int p, int[] arr){
		int answer = 0;
		int sum = 0;
		for(int i = 0; i < p; i++) {
			sum += arr[i];
			answer = sum;
		}
		for(int i = p; i < t; i++) {
			sum += arr[i] - arr[i - p];
			answer = Math.max(answer, sum);
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
