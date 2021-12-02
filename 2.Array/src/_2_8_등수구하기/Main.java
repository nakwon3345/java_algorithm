package _2_8_등수구하기;

import java.util.Scanner;

public class Main {
	
	public static int solution(int t, int[] arr){
		int answer = 0;
		int cnt = 0;
		for(int i = 0; i < t; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			}else {
				cnt = 0;
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
