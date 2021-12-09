package _2_9_격자판최대합;
// 가로 합 배열에 넣고 세로합 배열에 넣고 대각선 합 배열에 넣어서 가장 큰 값 출력?
import java.util.Scanner;

public class Main {
	public static int solution(int t, int[][] arr){
		int answer = 0;
		int sum1;
		int sum2;
		for(int i = 0; i < t; i++) {
			sum1 = sum2 = 0;
			for(int j = 0; j < t; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1 = sum2 = 0;
		for(int i = 0; i < t; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][t - i -1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
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
