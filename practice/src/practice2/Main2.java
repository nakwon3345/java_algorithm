package practice2;

import java.util.Scanner;

public class Main2 {
	
	public static int solution(int t, int[][] arr){
		int answer = 0;
		int max = 0;
		for(int i = 0; i < t; i ++) {
			int cnt = 0;
			for(int j = 0; j < t; j++) {
				for(int k = 0; k < 5; k++) {
					if(arr[i][j] == arr[j][i]) {
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
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(solution(t, arr));
	}

}
