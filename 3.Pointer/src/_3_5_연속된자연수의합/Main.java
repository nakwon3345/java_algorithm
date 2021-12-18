package _3_5_연속된자연수의합;

import java.util.Scanner;

public class Main {
	public static int solution(int t){
		int answer = 0;
		int sum = 0;
		int lt = 0;
		int m = t/2+1;
		int[] arr = new int[t];
		// m을 주석처리하고 t - 1로 해도 가능한데 이유는(t는 안되는 이유는?)?? m사용 이유는??
		for(int i = 0; i < m; i++) {
			arr[i] = i +1;
		}
		for(int i = 0; i < m; i++) {
			sum += arr[i];
			if(sum == t) {
				answer++;
			}
			while(sum >= t) {
				sum -= arr[lt++];
				if(sum == t) {
					answer++;
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
