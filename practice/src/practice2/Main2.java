package practice2;

import java.util.Scanner;

public class Main2 {
	
	public static int solution(int t, int[][] arr){
		int answer = 0;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				boolean flag = true;
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
		System.out.println(solution(t, arr));
	}

}
