package _2_11_임시반장정하기;

import java.util.Scanner;

public class Main {
	public static int solution(int t, int[][] arr){
		int answer = 0;
		int max = 0;
		for(int i = 1; i <= t; i++) {
			int cnt = 0;
			for(int j = 1; j <= t; j++) {
				for(int k = 1; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
				if(cnt > max) {
					max = cnt;
					answer = i;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int[][] arr = new int[t + 1][6];
		//몇 번째인지 구하기 위해 i = 1부터 시작 t보다 작은게 아닌 t까지
		for(int i = 1; i <= t; i++) {
			for(int j = 1; j <= 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
			System.out.print(solution(t, arr));
		
	}
}
