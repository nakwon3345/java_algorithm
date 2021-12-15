package _2_10_봉우리;

import java.util.Scanner;

public class Main {
	public static int solution(int t, int[][] arr){
		int[] dx = {-1, 0 , 1, 0};
		int[] dy = {0, 1, 0, -1};
		int answer = 0;
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx >= 0 && nx < t && ny >= 0 && ny < t && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag){
					answer++;
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
			for(int j = 0; j < t; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
			System.out.print(solution(t, arr));
		
	}
}
