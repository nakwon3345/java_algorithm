package review_2;

import java.util.ArrayList;
import java.util.Scanner;

public class _2_6 {
	
	public static boolean decimal(int num) {
		if(num == 1) {
			return false;
		}for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> solution(int t, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < t; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int reverse = tmp % 10;
				res = res * 10 + reverse;
				tmp = tmp/10;
			}if(decimal(res)) {
				answer.add(res);
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
