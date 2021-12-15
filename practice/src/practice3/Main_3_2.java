package practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_3_2 {
	public static List<Integer> solution(int t, int[] arr, int p, int[] brr){
		List<Integer> answer = new ArrayList<Integer>();
		int[] result = new int[arr.length + brr.length];
		System.arraycopy(arr, 0, result, 0, arr.length);
		System.arraycopy(brr, 0, result, arr.length, brr.length);
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				if(arr[i] == brr[j]) {
					answer.add(result[i]);
					Collections.sort(answer);
				}
			}
		}
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
