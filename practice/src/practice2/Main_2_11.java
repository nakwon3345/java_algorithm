package practice2;

import java.util.Scanner;

public class Main_2_11 {
	public static int solution(int t, int[][] arr){
		int answer = 0;
		int max = 0;
		for(int i = 0; i < t; i++) {
			int cnt = 0;
			for(int j = 0; j < t; j++) {
				for(int k = 0; k < t; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
				if(cnt > max) {
					max = cnt;
					answer = i + 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int[][] arr = new int[t][t];
		//몇 번째인지 구하기 위해 i = 1부터 시작 t보다 작은게 아닌 t까지
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
			System.out.print(solution(t, arr) + "번");
		
	}
}
