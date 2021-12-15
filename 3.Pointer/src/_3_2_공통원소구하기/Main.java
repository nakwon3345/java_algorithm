package _3_2_공통원소구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static ArrayList<Integer> solution(int t, int[] arr, int p, int[] brr){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr);
		Arrays.sort(brr);
		int p1 = 0;
		int p2 = 0;
		while(p1 < t && p2 < p) {
			if(arr[p1] == brr[p2]) {
				answer.add(arr[p1++]);
				p2++;
			}else if(arr[p1] < brr[p2]) {
				p1++;
			}else {
				p2++;
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
