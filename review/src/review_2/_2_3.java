package review_2;

import java.util.ArrayList;
import java.util.Scanner;

public class _2_3 {
	
	public static String solution(int t, int[] arr, int[] brr) {
		String answer = "";
		for(int i = 0; i < t; i++) {
			if(arr[i] == brr[i]) {
				answer += "D";
			}else if(arr[i] == 1 && brr[i] == 3) {
				answer += "A";
			}else if(arr[i] == 2 && brr[i] == 1) {
				answer += "A";
			}else if(arr[i] == 3 && brr[i] == 2) {
				answer += "A"; 
			}else {
				answer += "B";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int[] arr = new int[t];
		int[] brr = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = kb.nextInt();
		}
		for(int i = 0; i < t; i++) {
			brr[i] = kb.nextInt();
		}
		for(char x : solution(t, arr, brr).toCharArray()) {
			System.out.println(x);
		}
	}

}
