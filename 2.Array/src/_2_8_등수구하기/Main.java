package _2_8_등수구하기;

import java.util.Scanner;

public class Main {
	// arr배열과 점수가 순서대로 정렬된 배열에서 번호를 매기고 그 점수를 arr로 변환(동일 등수일 때 불가?)?
	public static int[] solution(int t, int[] arr){
		int[] answer = new int[t];
		for(int i = 0; i < t; i++) {
			int cnt = 1;
			for(int j = 0; j < t; j++) {
				if(arr[i] < arr[j]) {
					cnt++;
				}
			}
			answer[i] = cnt;
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
		for(int x : solution(t, arr)) {
			System.out.print(x + " ");
		}
	}
}
