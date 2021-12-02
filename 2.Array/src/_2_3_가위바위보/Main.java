package _2_3_가위바위보;

import java.util.Scanner;

public class Main {
	
	public String solution(int t, int[] arr, int[] brr){
		String answer = "";
		for(int i = 0; i < t; i++) {
			if(arr[i] == brr[i]) {
				answer += (i + 1) + "세트 " + "무승부" + "\n";
			}else if(arr[i] == 1 && brr[i] == 3) {
				answer += (i + 1) + "세트" + " A승" + "\n";
			}else if(arr[i] == 2 && brr[i] == 1) {
				answer += (i + 1) + "세트" + " A승" + "\n";
			}else if(arr[i] == 3 && brr[i] == 2) {
				answer += (i + 1) + "세트" + " A승" + "\n";
			}else {
				answer += (i + 1) + "세트" + " B승" + "\n";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
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
