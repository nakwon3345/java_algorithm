package review_2;

import java.util.Scanner;

public class _2_1 {
	
	public static int solution(int t, int[] arr) {
		int answer = 1;
		int max = arr[0];
		for(int i = 1; i < t; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int[] arr = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(t, arr));
	}

}
