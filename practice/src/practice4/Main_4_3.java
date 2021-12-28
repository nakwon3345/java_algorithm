package practice4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main_4_3 {
	public static ArrayList<Integer> solution(int t, int p, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < p - 1; i++) {
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int p = kb.nextInt();
		int[] arr = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : solution(t, p, arr))
			System.out.println(x + " ");
	}

}
