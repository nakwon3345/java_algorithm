package _2_12_멘토링;

import java.util.Scanner;

public class Main {
	public static int solution(int t, int p, int[][] arr){
		int answer = 0;
		for(int i = 1; i <= t; i++) {
			for(int j = 1; j <= t; j++) {
				int cnt = 0;
				for(int k = 0; k < p; k++) {
					int pi = 0;
					int pj = 0;
					for(int s = 0; s < t; s++) {
						if(arr[k][s] == i) {
							pi = s;
						}
						if(arr[k][s] == j) {
							pj = s;
						}
					}
					if(pi < pj) {
						cnt++;
					}
				}
				if(cnt == p) {
					answer++;
				}
				
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int p = kb.nextInt();
		int[][] arr = new int[p][t];
		for(int i = 0; i < p; i++) {
			for(int j = 0; j < t; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
			System.out.print(solution(t, p, arr));
		
	}
}
