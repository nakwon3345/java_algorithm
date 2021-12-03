package _2_3_가위바위보;

import java.util.Scanner;

public class Main2 {
	
	public String solution(int t, int[] arr, int[] brr){
		String answer = "";
		for(int i = 0; i < t; i++) {
			String set = (i + 1) + "세트: ";
			if(arr[i] == brr[i]) {
				answer += set + "무승부" + "\n";
			}else if(arr[i] == 1 && brr[i] == 3) {
				answer += set + "A승" + "\n";
			}else if(arr[i] == 2 && brr[i] == 1) {
				answer += set + "A승" + "\n";
			}else if(arr[i] == 3 && brr[i] == 2) {
				answer += set + "A승" + "\n";
			}else {
				answer += set + "B승" + "\n";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
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
			System.out.println(T.solution(t, arr, brr));
		
	}

}
