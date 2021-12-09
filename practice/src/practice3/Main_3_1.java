package practice3;

import java.util.Arrays;
import java.util.Scanner;

public class Main_3_1 {
	public static int[] solution(int t, int[] arr, int p, int[] brr){
		int[] answer = new int[arr.length + brr.length];
		System.arraycopy(arr, 0, answer, 0, arr.length);
		System.arraycopy(brr, 0, answer, arr.length, brr.length);
		Arrays.sort(answer);
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int[] arr = new int[t];
		for(int i = 0 ; i < t; i++) {
			arr[i] = kb.nextInt();
		}
		int p = kb.nextInt();
		int[] brr = new int[p];
		for(int i = 0; i < p; i++) {
			brr[i] = kb.nextInt();
		}
		for(int x : solution(t, arr, p ,brr)) {
			System.out.print(x + " ");
		}
	}
}
