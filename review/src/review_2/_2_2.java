package review_2;

import java.util.ArrayList;
import java.util.Scanner;

public class _2_2 {
	
	public static ArrayList<Integer> solution(int t, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i = 1; i < t; i++) {
			if(arr[i] > arr[i - 1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int[] arr = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : solution(t, arr)) {
			System.out.print(x + " ");
		}
	}

}
